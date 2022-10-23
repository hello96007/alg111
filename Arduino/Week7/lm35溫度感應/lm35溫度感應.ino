void setup() {
  // put your setup code here, to run once:
Serial.begin(9600);
}

void loop() {
  // put your main code here, to run repeatedly:

int val = analogRead(A0);
float Tem = (val/1023.0*5)/0.01;
Serial.print(Tem);
Serial.print("\n");
delay(500);
}


