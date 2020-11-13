# Installation (Windows):
1. Go on the Ruby website and install the latest version of Ruby, since SaSS depends on Ruby  
https://rubyinstaller.org/  
2. Then open a command prompt and type "gem install sass" which installs sass, and you are finished!   

# Essential Sass Commands (All OS):
- Create Sass file: "sass-convert Example.scss Example.sass" <- Converts the Example.scss file to Example.sass
- Convert Sass to CSS and create .map file (used for debugging): "sass Example.scss:Example.css"
- Automatically convert Sass to CSS while writing: "sass --watch Example.scss:Example.css" <- Ctrl + C to stop conversion
- Automatically convert of an entire directory to CSS: "sass --watch Directory:CSS"
- Compact (faster) the style sheet: "sass Example.scss:Example.css --style compact"
- Compress (fastest) the style sheet: "sass Example.scss:Example.css --style compress"
- Expanded (fast) the style sheet: "sass Example.scss:Example.css --style expanded"
- Remove the .map file from the style sheet: "sass Example.scss:Example.css --style --sourcemap=none"

# Differences between SCSS and SASS:
- ScSS uses brackets (more for Java developers, imo)
- SaSS doesn't use brackets but indents (more for python developers, imo)
- ScSS uses semi-colons, but SaSS does not

# Compile SCSS Applications
- https://www.sassmeister.com/ (online compiling)
- http://koala-app.com/ (easy GUI for compiling)

# SaSS Documentation
- https://sass-lang.com/documentation/file.SASS_REFERENCE.html