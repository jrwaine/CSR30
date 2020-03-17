# Tarefa de programação 1: Implementação de um servidor Web Multithread

APS: Servidor Web Multithread (ProgrammingAssignment1.zip)

http://wps.prenhall.com/br\_kurose\_redes\_5/

Ao final desta tarefa de programação, você terá desenvolvido, em Java, um servidor Web multithread, que seja capaz de atender várias requisições em paralelo. Você implementará a versão 1.0 do HTTP como definida na RFC 1945.

Lembre-se de que o HTTP/1.0 cria uma conexão TCP separada para cada par requisição/resposta. Cada uma dessas conexões será manipulada por uma thread. Haverá também uma thread principal, no qual o servidor ficará à escuta de clientes que quiserem estabelecer conexões. Para simplificar o trabalho de programação, desenvolveremos a codificação em dois estágios. No primeiro estágio,você implementará um servidor multithread que simplesmente apresenta o conteúdo da mensagem de requisição HTTP que recebe. Depois que esse programa estiver executando normalmente, você adicionará a codificação necessária para gerar uma resposta apropriada.

Ao desenvolver a codificação, você poderá testar seu servidor com um browser Web. Mas lembre-se de que você não estará atendendo através da porta padrão 80, portanto, precisará especificar o número de porta dentro da URL que der a seu browser. Por exemplo, se o nome de seu hospedeiro for host.someschool.edu, seu servidor estiver à escuta na porta 6789 e você quiser obter o arquivo index.html, então deverá especificar a seguinte URL dentro do browser:

http://host.someschool.edu:6789/index.html

Quando seu servidor encontrar um erro, deverá enviar uma mensagem de resposta com uma fonte HTML adequada, de modo que a informação de erro seja apresentada na janela do browser.
