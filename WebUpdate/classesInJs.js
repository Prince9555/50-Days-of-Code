class Polygon {
  constructor(height, width) {
    this.h = height;
    this.w = width;
  }
  test() {
    console.log("The height of the polygon: ", this.h);
    console.log("The width of the polygon: ", this.w);
  }
}
var polyObj = new Polygon(10, 20); //creating an instance
polyObj.test();
