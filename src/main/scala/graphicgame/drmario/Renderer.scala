package drmario

import scalafx.application.JFXApp
import scalafx.scene
import scalafx.scene.canvas.Canvas

class Rendered(canvas: Canvas) {
    val canvas = new Canvas (800,800)
    val renderer = new Renderer (canvas)
    val board = new Board

    stage = new JFXAPP
    def render(): unit = {
        val gc = canvas.graphicsContext2D
            gc.fill = Color.Black
            gc.fillRect(0, 0, 800, 800)
            for (elem <- board.elements; cell <- elem.cells) {
                val color = cell.color match {
                    case DMColor.Red => Color.Red
                    case DMColor.Yellow => Color.Yellow
                    case DMColor.Blue => Color.Blue
                }
                gc.fill = color
                cell match {
                    case v: Virus =>
                        gc.fillOval(v.x*20, v.y*20, 20, 20)
                    case pp: PillPiece =>
                }
            }
    }
}