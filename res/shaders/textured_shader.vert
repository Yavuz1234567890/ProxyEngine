#version 330 core

layout(location=0)in vec2 pos;
layout(location=1)in vec2 tc;

uniform vec4 color;

out vec4 body_color;
out vec2 texCoords;

void main(){
	gl_Position = vec4(pos, 0, 1);
	body_color = color;
	texCoords = tc;
}