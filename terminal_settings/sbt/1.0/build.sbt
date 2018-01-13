import sbt.errorssummary.Plugin.autoImport._

clippyColorsEnabled := true

reporterConfig := reporterConfig.value.withColumnNumbers(true).withReverseOrder(true).withShowLegend(false)

