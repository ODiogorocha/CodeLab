def criar_tabuleiro():
    return [[" " for _ in range(3)] for _ in range(3)]

def exibir_tabuleiro(tabuleiro):
    for linha in tabuleiro:
        print(" | ".join(linha))
        print("-" * 9)

def verificar_vitoria(tabuleiro, jogador):
    for i in range(3):
        if all(tabuleiro[i][j] == jogador for j in range(3)) or \
           all(tabuleiro[j][i] == jogador for j in range(3)):
            return True

    if all(tabuleiro[i][i] == jogador for i in range(3)) or \
       all(tabuleiro[i][2 - i] == jogador for i in range(3)):
        return True

    return False

def tabuleiro_cheio(tabuleiro):
    return all(tabuleiro[i][j] != " " for i in range(3) for j in range(3))

def obter_jogada():
    while True:
        try:
            linha, coluna = map(int, input("Digite linha e coluna (0-2 separados por espaço): ").split())
            if linha in range(3) and coluna in range(3):
                return linha, coluna
            else:
                print("Posição inválida! Escolha entre 0 e 2.")
        except ValueError:
            print("Entrada inválida! Digite dois números separados por espaço.")

def jogar():
    tabuleiro = criar_tabuleiro()
    jogador_atual = "X"

    while True:
        exibir_tabuleiro(tabuleiro)
        print(f"Vez do jogador {jogador_atual}")

        linha, coluna = obter_jogada()

        if tabuleiro[linha][coluna] != " ":
            print("Posição já ocupada! Tente novamente.")
            continue

        tabuleiro[linha][coluna] = jogador_atual

        if verificar_vitoria(tabuleiro, jogador_atual):
            exibir_tabuleiro(tabuleiro)
            print(f"Jogador {jogador_atual} venceu!")
            break

        if tabuleiro_cheio(tabuleiro):
            exibir_tabuleiro(tabuleiro)
            print("Empate!")
            break

        jogador_atual = "O" if jogador_atual == "X" else "X"

if __name__ == "__main__":
    jogar()
