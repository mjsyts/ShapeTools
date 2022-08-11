+ Rect {

    radiusH {^width/2}

	radiusH_ { |dx| ^this.class.aboutPoint(this.center, dx, height/2)}

    radiusV {^height/2}

	radiusV_ { |dy| ^this.class.aboutPoint(this.center, width/2, dy)}

	centerTop {^Point.new(left + (width/2), top) }

	centerTop_ { arg point; ^this.class.new(point.x-(width/2), point.y, width, height) }

	centerBottom {^Point.new(left + (width/2), height) }

	centerBottom_ { arg point; ^this.class.new(point.x-(width/2), point.y - height, width, height) }

	leftCenter {^Point.new(left, top + (height/2) ) }

	leftCenter_ { arg point; ^this.class.new(point.x, point.y - (height/2), width, height) }

	rightCenter {^Point.new(width, top + (height/2) ) }

	rightCenter_ { arg point; ^this.class.new(point.x - width, point.y - (height/2), width, height) }

}

