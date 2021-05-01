#version 330 core

layout(location=0)in vec2 pos;

uniform vec4 color;

out vec4 body_color;

void main(){
	gl_Position = vec4(pos, 0, 1);
	body_color = color;
}