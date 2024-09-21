# TermpPoject_ObjectOrianted
This is the term porject of Object Orianted and Design.

# introduction
本專題的主要功能為UML editor，一個透過GUI介面繪製出UML diagram的工具。設計出的工具除了要能滿足規格書的要求之外，還需要使用到課堂上所學的OOP與design patten來設計UML editor。

# 使用到的design patten
## singleton
將當前的狀態，深度，圖的成員...等相關的資訊使用singleton的方式來構建
## composite
group object為內含多個母類別的子類別，使用composite design patten的方式來構建
## observer
對於GUI使用者不同種的行為，如更改當前狀態，繪圖，使用menu的功能等，建立不同的類別來監控這些行為
## decorator
繪製線段時，使用decorator的方式為關聯線段加上不同的箭頭
## stategy
將不同模式中滑鼠在繪圖區的行為使用stategy的方式來實現，透過behavior interface將實現各個行為模式的code向外推至其他類別來實作

