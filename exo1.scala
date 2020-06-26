object exo1 {
  Travaux pratiques  mise à niveau
  EXO1: Bonnes pratiques
  1)L'avantage de la programmation scala est que les programmes écrits en Scala sont moins lourds
    car ils embarquent que ce qui leur est nécessaire, d'autre part, la syntaxe du langage est elle-même allégée
    puisque l'utilisation des fonctionnalités de Scala passe par l'appel aux fonctions
  des différentes bibliothèques.
    2)interpretation des instructions:
  var a=1 ou var  a:Int=1 /*Cela montre qu'n a une variable a qui a pour type entier et qui vaut 1*/
  val b=2 /*Cela indique qu'on a une constante b qui vaut 2*/
  final val c=4 /* Final permet de dire que la valeur de c ne peut pas etre changer.*/
  private  final val e=3 /* */
  val lazy nom="fall"

3)Option[Type] permet d’inviter l’initialisation des variables
  exemple:def prixAchat(prix:Int , bonnus:Option[Int]=None)=prix - bonnus.getOrElse(0)
  prixAchat(3)
  prixAchat(4, Some(1))
  4)Le polymorphisme peut etre defini comme etant le caractere de
    ce qui peut se présenter sous différentes formes.
  exemple: la classe image
  5)Le mécanisme d' incorporer une référence dans une chaîne de caractère
    est appelé l'interpolation.
  exemple1:
    Interpoler une référence dans une chaîne:
  val name="fall"
  println("ça va  mister " + name+ " ?" )    //dirty code
  println(s"ça va  mister $name ?")
exemple2:
  Interpoler  une évaluation dans une chaîne:
  val a=10
  val b=5
  println(" la valeur de a+b est "+a+b+5) ????
    println(s" la valeur de a+b est  ${a+b+5} ") ?????
    6)Donnons un exemple de fonction avec  du  pattern matching
  Les gardes de modèle sont simplement des expressions booléennes
  qui sont utilisées pour rendre les cas plus spécifiques.
    Ajoutez juste if <boolean expression>après le motif.
    def showImportantNotification(notification: Notification, importantPeopleInfo: Seq[String]): String = {
    notification match {
      case Email(sender, _, _) if importantPeopleInfo.contains(sender) =>
        "You got an email from special someone!"
      case SMS(number, _) if importantPeopleInfo.contains(number) =>
        "You got an SMS from special someone!"
      case other =>
        showNotification(other) // nothing special, delegate to our original showNotification function
    }
    7) L'avantage des lambda expression:c'est Une expression lambda qui est donc un raccourci syntaxique
  qui simplifie l'écriture de traitements passés en paramètre.
    Elle est particulièrement utile notamment lorsque le traitement n'est utile qu'une seule fois
    : elle évite d'avoir à écrire une méthode dans une classe.



    }












