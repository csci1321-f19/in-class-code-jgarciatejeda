package drmario

import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.canvas.Canvas
import Ssalafx.scene.paint.color

object Main extends JFXApp {
    stage = new JFXApp.PrimaryStage {
        title = "Dr. Mario"
        scene = new Scene(800, 800) {
            val canvas = new Canvas(800, 800)
            content = canvas
            val gc = canvas.graphicsContext2D
            gc.fill = Color.Black
            gc.fillRect(0, 0, 800, 800)
        }
    }
}