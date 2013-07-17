/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.hardware.photography;

import static android.hardware.photography.CameraMetadata.Key;

/**
 * ! Do not edit this file directly !
 *
 * Generated automatically from CaptureRequestKeys.mako
 *
 * TODO: Include a hash of the input files here that the build can check.
 */

/**
 * The base class for camera controls and information.
 *
 * This class defines the basic key/value map used for querying for camera
 * characteristics or capture results, and for setting camera request
 * parameters.
 *
 * @see CaptureRequest
 * @see CameraMetadata
 * @hide
 **/
public final class CaptureRequestKeys {
    public static final class ColorCorrection {

            public static final class ModeKey extends Key<ColorCorrection.ModeKey.Enum> {
                public enum Enum {
                    TRANSFORM_MATRIX,
                    FAST,
                    HIGH_QUALITY;
                }

                public static final Enum TRANSFORM_MATRIX = Enum.TRANSFORM_MATRIX;
                public static final Enum FAST = Enum.FAST;
                public static final Enum HIGH_QUALITY = Enum.HIGH_QUALITY;

                // TODO: remove requirement for constructor by making Key an interface
                private ModeKey(String name) {
                    super(name, ColorCorrection.ModeKey.Enum.class);
                }

            }

        public static final Key<ColorCorrection.ModeKey.Enum> MODE =
                new ModeKey("android.colorCorrection.mode");
        public static final Key<Rational[]> TRANSFORM =
                new Key<Rational[]>("android.colorCorrection.transform", Rational[].class);
        public static final Key<float[]> GAINS =
                new Key<float[]>("android.colorCorrection.gains", float[].class);

    }

    public static final class Control {

            public static final class AeAntibandingModeKey extends Key<Control.AeAntibandingModeKey.Enum> {
                public enum Enum {
                    OFF,
                    _50HZ,
                    _60HZ,
                    AUTO;
                }

                public static final Enum OFF = Enum.OFF;
                public static final Enum _50HZ = Enum._50HZ;
                public static final Enum _60HZ = Enum._60HZ;
                public static final Enum AUTO = Enum.AUTO;

                // TODO: remove requirement for constructor by making Key an interface
                private AeAntibandingModeKey(String name) {
                    super(name, Control.AeAntibandingModeKey.Enum.class);
                }

            }

        public static final Key<Control.AeAntibandingModeKey.Enum> AE_ANTIBANDING_MODE =
                new AeAntibandingModeKey("android.control.aeAntibandingMode");
        public static final Key<Integer> AE_EXPOSURE_COMPENSATION =
                new Key<Integer>("android.control.aeExposureCompensation", int.class);

            public static final class AeLockKey extends Key<Control.AeLockKey.Enum> {
                public enum Enum {
                    OFF,
                    ON;
                }

                public static final Enum OFF = Enum.OFF;
                public static final Enum ON = Enum.ON;

                // TODO: remove requirement for constructor by making Key an interface
                private AeLockKey(String name) {
                    super(name, Control.AeLockKey.Enum.class);
                }

            }

        public static final Key<Control.AeLockKey.Enum> AE_LOCK =
                new AeLockKey("android.control.aeLock");

            public static final class AeModeKey extends Key<Control.AeModeKey.Enum> {
                public enum Enum {
                    OFF,
                    ON,
                    ON_AUTO_FLASH,
                    ON_ALWAYS_FLASH,
                    ON_AUTO_FLASH_REDEYE;
                }

                public static final Enum OFF = Enum.OFF;
                public static final Enum ON = Enum.ON;
                public static final Enum ON_AUTO_FLASH = Enum.ON_AUTO_FLASH;
                public static final Enum ON_ALWAYS_FLASH = Enum.ON_ALWAYS_FLASH;
                public static final Enum ON_AUTO_FLASH_REDEYE = Enum.ON_AUTO_FLASH_REDEYE;

                // TODO: remove requirement for constructor by making Key an interface
                private AeModeKey(String name) {
                    super(name, Control.AeModeKey.Enum.class);
                }

            }

        public static final Key<Control.AeModeKey.Enum> AE_MODE =
                new AeModeKey("android.control.aeMode");
        public static final Key<int[]> AE_REGIONS =
                new Key<int[]>("android.control.aeRegions", int[].class);
        public static final Key<int[]> AE_TARGET_FPS_RANGE =
                new Key<int[]>("android.control.aeTargetFpsRange", int[].class);

            public static final class AePrecaptureTriggerKey extends Key<Control.AePrecaptureTriggerKey.Enum> {
                public enum Enum {
                    IDLE,
                    START;
                }

                public static final Enum IDLE = Enum.IDLE;
                public static final Enum START = Enum.START;

                // TODO: remove requirement for constructor by making Key an interface
                private AePrecaptureTriggerKey(String name) {
                    super(name, Control.AePrecaptureTriggerKey.Enum.class);
                }

            }

        public static final Key<Control.AePrecaptureTriggerKey.Enum> AE_PRECAPTURE_TRIGGER =
                new AePrecaptureTriggerKey("android.control.aePrecaptureTrigger");

            public static final class AfModeKey extends Key<Control.AfModeKey.Enum> {
                public enum Enum {
                    OFF,
                    AUTO,
                    MACRO,
                    CONTINUOUS_VIDEO,
                    CONTINUOUS_PICTURE,
                    EDOF;
                }

                public static final Enum OFF = Enum.OFF;
                public static final Enum AUTO = Enum.AUTO;
                public static final Enum MACRO = Enum.MACRO;
                public static final Enum CONTINUOUS_VIDEO = Enum.CONTINUOUS_VIDEO;
                public static final Enum CONTINUOUS_PICTURE = Enum.CONTINUOUS_PICTURE;
                public static final Enum EDOF = Enum.EDOF;

                // TODO: remove requirement for constructor by making Key an interface
                private AfModeKey(String name) {
                    super(name, Control.AfModeKey.Enum.class);
                }

            }

        public static final Key<Control.AfModeKey.Enum> AF_MODE =
                new AfModeKey("android.control.afMode");
        public static final Key<int[]> AF_REGIONS =
                new Key<int[]>("android.control.afRegions", int[].class);

            public static final class AfTriggerKey extends Key<Control.AfTriggerKey.Enum> {
                public enum Enum {
                    IDLE,
                    START,
                    CANCEL;
                }

                public static final Enum IDLE = Enum.IDLE;
                public static final Enum START = Enum.START;
                public static final Enum CANCEL = Enum.CANCEL;

                // TODO: remove requirement for constructor by making Key an interface
                private AfTriggerKey(String name) {
                    super(name, Control.AfTriggerKey.Enum.class);
                }

            }

        public static final Key<Control.AfTriggerKey.Enum> AF_TRIGGER =
                new AfTriggerKey("android.control.afTrigger");

            public static final class AwbLockKey extends Key<Control.AwbLockKey.Enum> {
                public enum Enum {
                    OFF,
                    ON;
                }

                public static final Enum OFF = Enum.OFF;
                public static final Enum ON = Enum.ON;

                // TODO: remove requirement for constructor by making Key an interface
                private AwbLockKey(String name) {
                    super(name, Control.AwbLockKey.Enum.class);
                }

            }

        public static final Key<Control.AwbLockKey.Enum> AWB_LOCK =
                new AwbLockKey("android.control.awbLock");

            public static final class AwbModeKey extends Key<Control.AwbModeKey.Enum> {
                public enum Enum {
                    OFF,
                    AUTO,
                    INCANDESCENT,
                    FLUORESCENT,
                    WARM_FLUORESCENT,
                    DAYLIGHT,
                    CLOUDY_DAYLIGHT,
                    TWILIGHT,
                    SHADE;
                }

                public static final Enum OFF = Enum.OFF;
                public static final Enum AUTO = Enum.AUTO;
                public static final Enum INCANDESCENT = Enum.INCANDESCENT;
                public static final Enum FLUORESCENT = Enum.FLUORESCENT;
                public static final Enum WARM_FLUORESCENT = Enum.WARM_FLUORESCENT;
                public static final Enum DAYLIGHT = Enum.DAYLIGHT;
                public static final Enum CLOUDY_DAYLIGHT = Enum.CLOUDY_DAYLIGHT;
                public static final Enum TWILIGHT = Enum.TWILIGHT;
                public static final Enum SHADE = Enum.SHADE;

                // TODO: remove requirement for constructor by making Key an interface
                private AwbModeKey(String name) {
                    super(name, Control.AwbModeKey.Enum.class);
                }

            }

        public static final Key<Control.AwbModeKey.Enum> AWB_MODE =
                new AwbModeKey("android.control.awbMode");
        public static final Key<int[]> AWB_REGIONS =
                new Key<int[]>("android.control.awbRegions", int[].class);

            public static final class CaptureIntentKey extends Key<Control.CaptureIntentKey.Enum> {
                public enum Enum {
                    CUSTOM,
                    PREVIEW,
                    STILL_CAPTURE,
                    VIDEO_RECORD,
                    VIDEO_SNAPSHOT,
                    ZERO_SHUTTER_LAG;
                }

                public static final Enum CUSTOM = Enum.CUSTOM;
                public static final Enum PREVIEW = Enum.PREVIEW;
                public static final Enum STILL_CAPTURE = Enum.STILL_CAPTURE;
                public static final Enum VIDEO_RECORD = Enum.VIDEO_RECORD;
                public static final Enum VIDEO_SNAPSHOT = Enum.VIDEO_SNAPSHOT;
                public static final Enum ZERO_SHUTTER_LAG = Enum.ZERO_SHUTTER_LAG;

                // TODO: remove requirement for constructor by making Key an interface
                private CaptureIntentKey(String name) {
                    super(name, Control.CaptureIntentKey.Enum.class);
                }

            }

        public static final Key<Control.CaptureIntentKey.Enum> CAPTURE_INTENT =
                new CaptureIntentKey("android.control.captureIntent");

            public static final class EffectModeKey extends Key<Control.EffectModeKey.Enum> {
                public enum Enum {
                    OFF,
                    MONO,
                    NEGATIVE,
                    SOLARIZE,
                    SEPIA,
                    POSTERIZE,
                    WHITEBOARD,
                    BLACKBOARD,
                    AQUA;
                }

                public static final Enum OFF = Enum.OFF;
                public static final Enum MONO = Enum.MONO;
                public static final Enum NEGATIVE = Enum.NEGATIVE;
                public static final Enum SOLARIZE = Enum.SOLARIZE;
                public static final Enum SEPIA = Enum.SEPIA;
                public static final Enum POSTERIZE = Enum.POSTERIZE;
                public static final Enum WHITEBOARD = Enum.WHITEBOARD;
                public static final Enum BLACKBOARD = Enum.BLACKBOARD;
                public static final Enum AQUA = Enum.AQUA;

                // TODO: remove requirement for constructor by making Key an interface
                private EffectModeKey(String name) {
                    super(name, Control.EffectModeKey.Enum.class);
                }

            }

        public static final Key<Control.EffectModeKey.Enum> EFFECT_MODE =
                new EffectModeKey("android.control.effectMode");

            public static final class ModeKey extends Key<Control.ModeKey.Enum> {
                public enum Enum {
                    OFF,
                    AUTO,
                    USE_SCENE_MODE;
                }

                public static final Enum OFF = Enum.OFF;
                public static final Enum AUTO = Enum.AUTO;
                public static final Enum USE_SCENE_MODE = Enum.USE_SCENE_MODE;

                // TODO: remove requirement for constructor by making Key an interface
                private ModeKey(String name) {
                    super(name, Control.ModeKey.Enum.class);
                }

            }

        public static final Key<Control.ModeKey.Enum> MODE =
                new ModeKey("android.control.mode");

            public static final class SceneModeKey extends Key<Control.SceneModeKey.Enum> {
                public enum Enum {
                    UNSUPPORTED,
                    FACE_PRIORITY,
                    ACTION,
                    PORTRAIT,
                    LANDSCAPE,
                    NIGHT,
                    NIGHT_PORTRAIT,
                    THEATRE,
                    BEACH,
                    SNOW,
                    SUNSET,
                    STEADYPHOTO,
                    FIREWORKS,
                    SPORTS,
                    PARTY,
                    CANDLELIGHT,
                    BARCODE;
                }

                public static final Enum UNSUPPORTED = Enum.UNSUPPORTED;
                public static final Enum FACE_PRIORITY = Enum.FACE_PRIORITY;
                public static final Enum ACTION = Enum.ACTION;
                public static final Enum PORTRAIT = Enum.PORTRAIT;
                public static final Enum LANDSCAPE = Enum.LANDSCAPE;
                public static final Enum NIGHT = Enum.NIGHT;
                public static final Enum NIGHT_PORTRAIT = Enum.NIGHT_PORTRAIT;
                public static final Enum THEATRE = Enum.THEATRE;
                public static final Enum BEACH = Enum.BEACH;
                public static final Enum SNOW = Enum.SNOW;
                public static final Enum SUNSET = Enum.SUNSET;
                public static final Enum STEADYPHOTO = Enum.STEADYPHOTO;
                public static final Enum FIREWORKS = Enum.FIREWORKS;
                public static final Enum SPORTS = Enum.SPORTS;
                public static final Enum PARTY = Enum.PARTY;
                public static final Enum CANDLELIGHT = Enum.CANDLELIGHT;
                public static final Enum BARCODE = Enum.BARCODE;

                // TODO: remove requirement for constructor by making Key an interface
                private SceneModeKey(String name) {
                    super(name, Control.SceneModeKey.Enum.class);
                }

                static {
                    CameraMetadata.registerEnumValues(Control.SceneModeKey.Enum.class, new int[] {
                        0,  // UNSUPPORTED
                        1,  // FACE_PRIORITY
                        2,  // ACTION
                        3,  // PORTRAIT
                        4,  // LANDSCAPE
                        5,  // NIGHT
                        6,  // NIGHT_PORTRAIT
                        7,  // THEATRE
                        8,  // BEACH
                        9,  // SNOW
                        10,  // SUNSET
                        11,  // STEADYPHOTO
                        12,  // FIREWORKS
                        13,  // SPORTS
                        14,  // PARTY
                        15,  // CANDLELIGHT
                        16  // BARCODE
                    });
                }
            }

        public static final Key<Control.SceneModeKey.Enum> SCENE_MODE =
                new SceneModeKey("android.control.sceneMode");

            public static final class VideoStabilizationModeKey extends Key<Control.VideoStabilizationModeKey.Enum> {
                public enum Enum {
                    OFF,
                    ON;
                }

                public static final Enum OFF = Enum.OFF;
                public static final Enum ON = Enum.ON;

                // TODO: remove requirement for constructor by making Key an interface
                private VideoStabilizationModeKey(String name) {
                    super(name, Control.VideoStabilizationModeKey.Enum.class);
                }

            }

        public static final Key<Control.VideoStabilizationModeKey.Enum> VIDEO_STABILIZATION_MODE =
                new VideoStabilizationModeKey("android.control.videoStabilizationMode");

    }

    public static final class Edge {

            public static final class ModeKey extends Key<Edge.ModeKey.Enum> {
                public enum Enum {
                    OFF,
                    FAST,
                    HIGH_QUALITY;
                }

                public static final Enum OFF = Enum.OFF;
                public static final Enum FAST = Enum.FAST;
                public static final Enum HIGH_QUALITY = Enum.HIGH_QUALITY;

                // TODO: remove requirement for constructor by making Key an interface
                private ModeKey(String name) {
                    super(name, Edge.ModeKey.Enum.class);
                }

            }

        public static final Key<Edge.ModeKey.Enum> MODE =
                new ModeKey("android.edge.mode");

    }

    public static final class Flash {

            public static final class ModeKey extends Key<Flash.ModeKey.Enum> {
                public enum Enum {
                    OFF,
                    SINGLE,
                    TORCH;
                }

                public static final Enum OFF = Enum.OFF;
                public static final Enum SINGLE = Enum.SINGLE;
                public static final Enum TORCH = Enum.TORCH;

                // TODO: remove requirement for constructor by making Key an interface
                private ModeKey(String name) {
                    super(name, Flash.ModeKey.Enum.class);
                }

            }

        public static final Key<Flash.ModeKey.Enum> MODE =
                new ModeKey("android.flash.mode");

    }

    public static final class Jpeg {
        public static final Key<double[]> GPS_COORDINATES =
                new Key<double[]>("android.jpeg.gpsCoordinates", double[].class);
        public static final Key<Byte> GPS_PROCESSING_METHOD =
                new Key<Byte>("android.jpeg.gpsProcessingMethod", byte.class);
        public static final Key<Long> GPS_TIMESTAMP =
                new Key<Long>("android.jpeg.gpsTimestamp", long.class);
        public static final Key<Integer> ORIENTATION =
                new Key<Integer>("android.jpeg.orientation", int.class);
        public static final Key<Byte> QUALITY =
                new Key<Byte>("android.jpeg.quality", byte.class);
        public static final Key<Byte> THUMBNAIL_QUALITY =
                new Key<Byte>("android.jpeg.thumbnailQuality", byte.class);
        public static final Key<int[]> THUMBNAIL_SIZE =
                new Key<int[]>("android.jpeg.thumbnailSize", int[].class);

    }

    public static final class Lens {
        public static final Key<Float> APERTURE =
                new Key<Float>("android.lens.aperture", float.class);
        public static final Key<Float> FILTER_DENSITY =
                new Key<Float>("android.lens.filterDensity", float.class);
        public static final Key<Float> FOCAL_LENGTH =
                new Key<Float>("android.lens.focalLength", float.class);
        public static final Key<Float> FOCUS_DISTANCE =
                new Key<Float>("android.lens.focusDistance", float.class);

            public static final class OpticalStabilizationModeKey extends Key<Lens.OpticalStabilizationModeKey.Enum> {
                public enum Enum {
                    OFF,
                    ON;
                }

                public static final Enum OFF = Enum.OFF;
                public static final Enum ON = Enum.ON;

                // TODO: remove requirement for constructor by making Key an interface
                private OpticalStabilizationModeKey(String name) {
                    super(name, Lens.OpticalStabilizationModeKey.Enum.class);
                }

            }

        public static final Key<Lens.OpticalStabilizationModeKey.Enum> OPTICAL_STABILIZATION_MODE =
                new OpticalStabilizationModeKey("android.lens.opticalStabilizationMode");

    }

    public static final class NoiseReduction {

            public static final class ModeKey extends Key<NoiseReduction.ModeKey.Enum> {
                public enum Enum {
                    OFF,
                    FAST,
                    HIGH_QUALITY;
                }

                public static final Enum OFF = Enum.OFF;
                public static final Enum FAST = Enum.FAST;
                public static final Enum HIGH_QUALITY = Enum.HIGH_QUALITY;

                // TODO: remove requirement for constructor by making Key an interface
                private ModeKey(String name) {
                    super(name, NoiseReduction.ModeKey.Enum.class);
                }

            }

        public static final Key<NoiseReduction.ModeKey.Enum> MODE =
                new ModeKey("android.noiseReduction.mode");

    }

    /**
     * @hide
     */
    public static final class Request {
        /**
         * @hide
         */
        public static final Key<Integer> ID =
                new Key<Integer>("android.request.id", int.class);

    }

    public static final class Scaler {
        public static final Key<int[]> CROP_REGION =
                new Key<int[]>("android.scaler.cropRegion", int[].class);

    }

    public static final class Sensor {
        public static final Key<Long> EXPOSURE_TIME =
                new Key<Long>("android.sensor.exposureTime", long.class);
        public static final Key<Long> FRAME_DURATION =
                new Key<Long>("android.sensor.frameDuration", long.class);
        public static final Key<Integer> SENSITIVITY =
                new Key<Integer>("android.sensor.sensitivity", int.class);

    }

    public static final class Statistics {

            public static final class FaceDetectModeKey extends Key<Statistics.FaceDetectModeKey.Enum> {
                public enum Enum {
                    OFF,
                    SIMPLE,
                    FULL;
                }

                public static final Enum OFF = Enum.OFF;
                public static final Enum SIMPLE = Enum.SIMPLE;
                public static final Enum FULL = Enum.FULL;

                // TODO: remove requirement for constructor by making Key an interface
                private FaceDetectModeKey(String name) {
                    super(name, Statistics.FaceDetectModeKey.Enum.class);
                }

            }

        public static final Key<Statistics.FaceDetectModeKey.Enum> FACE_DETECT_MODE =
                new FaceDetectModeKey("android.statistics.faceDetectMode");

    }

    public static final class Tonemap {
        public static final Key<Float> CURVE_BLUE =
                new Key<Float>("android.tonemap.curveBlue", float.class);
        public static final Key<Float> CURVE_GREEN =
                new Key<Float>("android.tonemap.curveGreen", float.class);
        public static final Key<float[]> CURVE_RED =
                new Key<float[]>("android.tonemap.curveRed", float[].class);

            public static final class ModeKey extends Key<Tonemap.ModeKey.Enum> {
                public enum Enum {
                    CONTRAST_CURVE,
                    FAST,
                    HIGH_QUALITY;
                }

                public static final Enum CONTRAST_CURVE = Enum.CONTRAST_CURVE;
                public static final Enum FAST = Enum.FAST;
                public static final Enum HIGH_QUALITY = Enum.HIGH_QUALITY;

                // TODO: remove requirement for constructor by making Key an interface
                private ModeKey(String name) {
                    super(name, Tonemap.ModeKey.Enum.class);
                }

            }

        public static final Key<Tonemap.ModeKey.Enum> MODE =
                new ModeKey("android.tonemap.mode");

    }

    /**
     * @hide
     */
    public static final class Led {

            /**
             * @hide
             */
            public static final class TransmitKey extends Key<Led.TransmitKey.Enum> {
                public enum Enum {
                    OFF,
                    ON;
                }

                public static final Enum OFF = Enum.OFF;
                public static final Enum ON = Enum.ON;

                // TODO: remove requirement for constructor by making Key an interface
                private TransmitKey(String name) {
                    super(name, Led.TransmitKey.Enum.class);
                }

            }

        /**
         * @hide
         */
        public static final Key<Led.TransmitKey.Enum> TRANSMIT =
                new TransmitKey("android.led.transmit");

    }

    public static final class BlackLevel {

            public static final class LockKey extends Key<BlackLevel.LockKey.Enum> {
                public enum Enum {
                    OFF,
                    ON;
                }

                public static final Enum OFF = Enum.OFF;
                public static final Enum ON = Enum.ON;

                // TODO: remove requirement for constructor by making Key an interface
                private LockKey(String name) {
                    super(name, BlackLevel.LockKey.Enum.class);
                }

            }

        public static final Key<BlackLevel.LockKey.Enum> LOCK =
                new LockKey("android.blackLevel.lock");

    }

}


