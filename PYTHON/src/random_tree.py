import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
from sklearn.datasets import load_iris
from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier, plot_tree
from sklearn.ensemble import RandomForestClassifier
from sklearn.metrics import classification_report, accuracy_score, confusion_matrix

iris = load_iris()
caracteristicas = pd.DataFrame(iris.data, columns=iris.feature_names)
rotulos = pd.Series(iris.target)

caracteristicas_treino, caracteristicas_teste, rotulos_treino, rotulos_teste = train_test_split(
    caracteristicas, rotulos, test_size=0.3, random_state=42
)

modelo_arvore = DecisionTreeClassifier(random_state=42)
modelo_arvore.fit(caracteristicas_treino, rotulos_treino)

modelo_floresta = RandomForestClassifier(n_estimators=100, random_state=42)
modelo_floresta.fit(caracteristicas_treino, rotulos_treino)

previsoes_arvore = modelo_arvore.predict(caracteristicas_teste)
previsoes_floresta = modelo_floresta.predict(caracteristicas_teste)

print("Resultados - Árvore de Decisão:")
print(classification_report(rotulos_teste, previsoes_arvore, target_names=iris.target_names))
print("Acurácia:", accuracy_score(rotulos_teste, previsoes_arvore))

print("\nResultados - Floresta Aleatória:")
print(classification_report(rotulos_teste, previsoes_floresta, target_names=iris.target_names))
print("Acurácia:", accuracy_score(rotulos_teste, previsoes_floresta))


plt.figure(figsize=(14, 8))
plot_tree(
    modelo_arvore,
    feature_names=iris.feature_names,
    class_names=iris.target_names,
    filled=True
)
plt.title("Árvore de Decisão - Visualização Estrutural")
plt.show()

importancias = modelo_floresta.feature_importances_
plt.figure(figsize=(8, 5))
sns.barplot(x=importancias, y=iris.feature_names, color="skyblue")
plt.title("Importância das Características - Floresta Aleatória")
plt.xlabel("Importância")
plt.ylabel("Características")
plt.tight_layout()
plt.show()

matriz_arvore = confusion_matrix(rotulos_teste, previsoes_arvore)
plt.figure(figsize=(6, 5))
sns.heatmap(matriz_arvore, annot=True, fmt="d", cmap="Blues",
            xticklabels=iris.target_names, yticklabels=iris.target_names)
plt.title("Matriz de Confusão - Árvore de Decisão")
plt.xlabel("Previsto")
plt.ylabel("Real")
plt.tight_layout()
plt.show()

matriz_floresta = confusion_matrix(rotulos_teste, previsoes_floresta)
plt.figure(figsize=(6, 5))
sns.heatmap(matriz_floresta, annot=True, fmt="d", cmap="Greens",
            xticklabels=iris.target_names, yticklabels=iris.target_names)
plt.title("Matriz de Confusão - Floresta Aleatória")
plt.xlabel("Previsto")
plt.ylabel("Real")
plt.tight_layout()
plt.show()
