#version 330 core

in vec4 body_color;
in vec2 texCoords;

uniform sampler2D tex;

void main(){
	gl_FragColor = body_color * texture(tex, texCoords);
}