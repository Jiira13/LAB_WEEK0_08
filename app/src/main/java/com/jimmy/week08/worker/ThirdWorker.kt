package com.jimmy.week08.worker

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class ThirdWorker(context: Context, params: WorkerParameters) : Worker(context, params) {
    override fun doWork(): Result {
        val id = inputData.getString(INPUT_DATA_ID)
            ?: return Result.failure()

        // Simulate work
        Thread.sleep(2000)

        return Result.success()
    }

    companion object {
        const val INPUT_DATA_ID = "ThirdWorkerId"
    }
}
