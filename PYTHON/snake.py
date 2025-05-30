import pygame
import random
import sys

# === Constantes ===
LARGURA_JANELA = 600
ALTURA_JANELA = 400
TAMANHO_CELULA = 20
FPS = 10

# === Cores ===
BRANCO = (255, 255, 255)
VERDE = (0, 200, 0)
VERDE_ESCURO = (0, 100, 0)
VERMELHO = (255, 0, 0)
PRETO = (0, 0, 0)


# === Funções auxiliares ===
def desenhar_grade(tela):
    for x in range(0, LARGURA_JANELA, TAMANHO_CELULA):
        pygame.draw.line(tela, VERDE_ESCURO, (x, 0), (x, ALTURA_JANELA))
    for y in range(0, ALTURA_JANELA, TAMANHO_CELULA):
        pygame.draw.line(tela, VERDE_ESCURO, (0, y), (LARGURA_JANELA, y))


def desenhar_cobrinha(tela, cobrinha):
    for segmento in cobrinha:
        pygame.draw.rect(tela, VERDE, pygame.Rect(segmento[0], segmento[1], TAMANHO_CELULA, TAMANHO_CELULA))


def desenhar_comida(tela, posicao_comida):
    pygame.draw.rect(tela, VERMELHO, pygame.Rect(posicao_comida[0], posicao_comida[1], TAMANHO_CELULA, TAMANHO_CELULA))


def gerar_posicao_aleatoria_comida():
    x = random.randint(0, (LARGURA_JANELA - TAMANHO_CELULA) // TAMANHO_CELULA) * TAMANHO_CELULA
    y = random.randint(0, (ALTURA_JANELA - TAMANHO_CELULA) // TAMANHO_CELULA) * TAMANHO_CELULA
    return x, y


def exibir_game_over(tela, pontuacao):
    fonte = pygame.font.SysFont('arial', 30)
    texto = fonte.render(f"Fim de jogo! Pontuação: {pontuacao}", True, BRANCO)
    tela.blit(texto, (LARGURA_JANELA // 4, ALTURA_JANELA // 2))
    pygame.display.flip()
    pygame.time.wait(3000)
    pygame.quit()
    sys.exit()


# === Função principal ===
def main():
    pygame.init()
    tela = pygame.display.set_mode((LARGURA_JANELA, ALTURA_JANELA))
    pygame.display.set_caption("Jogo da Cobrinha")
    relogio = pygame.time.Clock()

    cobrinha = [(100, 100), (80, 100), (60, 100)]
    direcao = (TAMANHO_CELULA, 0)
    posicao_comida = gerar_posicao_aleatoria_comida()

    executando = True
    while executando:
        tela.fill(PRETO)
        desenhar_grade(tela)

        # Eventos
        for evento in pygame.event.get():
            if evento.type == pygame.QUIT:
                executando = False

            if evento.type == pygame.KEYDOWN:
                if evento.key == pygame.K_UP and direcao != (0, TAMANHO_CELULA):
                    direcao = (0, -TAMANHO_CELULA)
                elif evento.key == pygame.K_DOWN and direcao != (0, -TAMANHO_CELULA):
                    direcao = (0, TAMANHO_CELULA)
                elif evento.key == pygame.K_LEFT and direcao != (TAMANHO_CELULA, 0):
                    direcao = (-TAMANHO_CELULA, 0)
                elif evento.key == pygame.K_RIGHT and direcao != (-TAMANHO_CELULA, 0):
                    direcao = (TAMANHO_CELULA, 0)

        # Atualiza a posição da cabeça
        cabeca_x, cabeca_y = cobrinha[0]
        nova_cabeca = (cabeca_x + direcao[0], cabeca_y + direcao[1])
        cobrinha.insert(0, nova_cabeca)

        # Verifica colisão com comida
        if nova_cabeca == posicao_comida:
            posicao_comida = gerar_posicao_aleatoria_comida()
        else:
            cobrinha.pop()

        # Verifica colisão com paredes ou com o corpo
        if (nova_cabeca[0] < 0 or nova_cabeca[0] >= LARGURA_JANELA or
            nova_cabeca[1] < 0 or nova_cabeca[1] >= ALTURA_JANELA or
            nova_cabeca in cobrinha[1:]):
            exibir_game_over(tela, len(cobrinha) - 3)

        desenhar_cobrinha(tela, cobrinha)
        desenhar_comida(tela, posicao_comida)

        pygame.display.update()
        relogio.tick(FPS)

    pygame.quit()


if __name__ == "__main__":
    main()
