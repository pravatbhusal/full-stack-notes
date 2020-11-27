# Flexbox
The godsend of all CSS positioning. The epitome of simple, but flexible positioning. The reason CSS developers don't have to pull their hair out from using weird CSS tricks to position elements.

Flexbox allows you to put HTML elements into adjustable boxes, which these boxes can be put into a parent div and positioned inside of that div.

Read the complete guide to flexbox here: https://css-tricks.com/snippets/css/a-guide-to-flexbox/

For a shorter guide, read the W3Schools guide: https://www.w3schools.com/css/css3_flexbox.asp

# Relative and Absolute Position
If a parent element is relative and its child element is absolute, then you can position the child
element anywhere relative the parent element.

This is very helpful if we're trying to create position an element at the exterior of an element
or at the edges of the element.

# Padding and Margin
Padding is used for internal spacing. Margin is used for external spacing.

# Viewport
The viewport is the height and width of the screen. We can use "vh" and "vw" to make margins, padding, spacing, and widths/heights relative to the size of the screen.

Ex: If the screen has a height of 720px, then 50vh means 360px.  
Ex: If the screen has a width of 1000px, then 25vw means 250px.  

The difference between viewports and using percentages is that viewports are independent since it uses the pixels in the screen while percentages depend on the parent element's size. A good technique would be to use flex or percentages on the children elements while using viewport on the parent elements.