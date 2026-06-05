package u5;

import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import u0.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g {
    public static final String[] D;
    public static final int[] E;
    public static final byte[] F;
    public static final d G;
    public static final d[][] H;
    public static final d[] I;
    public static final HashMap[] J;
    public static final HashMap[] K;
    public static final Set L;
    public static final HashMap M;
    public static final Charset N;
    public static final byte[] O;
    public static final byte[] P;

    /* renamed from: a, reason: collision with root package name */
    public final FileDescriptor f16651a;

    /* renamed from: b, reason: collision with root package name */
    public int f16652b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap[] f16653c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f16654d;

    /* renamed from: e, reason: collision with root package name */
    public ByteOrder f16655e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16656f;

    /* renamed from: g, reason: collision with root package name */
    public int f16657g;

    /* renamed from: h, reason: collision with root package name */
    public int f16658h;

    /* renamed from: i, reason: collision with root package name */
    public int f16659i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public c f16660k;

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f16636l = Log.isLoggable("ExifInterface", 3);

    /* renamed from: m, reason: collision with root package name */
    public static final List f16637m = Arrays.asList(1, 6, 3, 8);

    /* renamed from: n, reason: collision with root package name */
    public static final List f16638n = Arrays.asList(2, 7, 4, 5);

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f16639o = {8, 8, 8};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f16640p = {8};

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f16641q = {-1, -40, -1};

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f16642r = {102, 116, 121, 112};

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f16643s = {109, 105, 102, 49};

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f16644t = {104, 101, 105, 99};

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f16645u = {97, 118, 105, 102};

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f16646v = {97, 118, 105, 115};

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f16647w = {79, 76, 89, 77, 80, 0};

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f16648x = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f16649y = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f16650z = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
    public static final byte[] A = {82, 73, 70, 70};
    public static final byte[] B = {87, 69, 66, 80};
    public static final byte[] C = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        D = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        E = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        F = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, "ImageWidth", 4), new d(257, 3, "ImageLength", 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, "StripOffsets", 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, "RowsPerStrip", 4), new d(279, 3, "StripByteCounts", 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d(40962, 3, "PixelXDimension", 4), new d(40963, 3, "PixelYDimension", 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d(50720, 3, "DefaultCropSize", 4)};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d(2, 5, "GPSLatitude", 10), new d("GPSLongitudeRef", 3, 2), new d(4, 5, "GPSLongitude", 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, "ThumbnailImageWidth", 4), new d(257, 3, "ThumbnailImageLength", 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, "StripOffsets", 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, "RowsPerStrip", 4), new d(279, 3, "StripByteCounts", 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d(50720, 3, "DefaultCropSize", 4)};
        G = new d("StripOffsets", 273, 3);
        H = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        I = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        J = new HashMap[10];
        K = new HashMap[10];
        L = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        M = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        N = charsetForName;
        O = "Exif\u0000\u0000".getBytes(charsetForName);
        P = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            d[][] dVarArr6 = H;
            if (i10 >= dVarArr6.length) {
                HashMap map = M;
                d[] dVarArr7 = I;
                map.put(Integer.valueOf(dVarArr7[0].f16630a), 5);
                map.put(Integer.valueOf(dVarArr7[1].f16630a), 1);
                map.put(Integer.valueOf(dVarArr7[2].f16630a), 2);
                map.put(Integer.valueOf(dVarArr7[3].f16630a), 3);
                map.put(Integer.valueOf(dVarArr7[4].f16630a), 7);
                map.put(Integer.valueOf(dVarArr7[5].f16630a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            J[i10] = new HashMap();
            K[i10] = new HashMap();
            for (d dVar : dVarArr6[i10]) {
                J[i10].put(Integer.valueOf(dVar.f16630a), dVar);
                K[i10].put(dVar.f16631b, dVar);
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad A[Catch: all -> 0x002e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x002e, blocks: (B:3:0x001f, B:5:0x0022, B:12:0x0037, B:18:0x0054, B:25:0x0067, B:31:0x007a, B:28:0x006f, B:29:0x0073, B:30:0x0077, B:32:0x0084, B:34:0x008d, B:36:0x0093, B:38:0x0099, B:40:0x009f, B:45:0x00ad), top: B:55:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(k8.l r9) {
        /*
            r8 = this;
            r8.<init>()
            u5.d[][] r0 = u5.g.H
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r8.f16653c = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r2 = r0.length
            r1.<init>(r2)
            r8.f16654d = r1
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r8.f16655e = r1
            java.lang.String r1 = "ExifInterface"
            boolean r2 = u5.g.f16636l
            r3 = 0
            r8.f16651a = r3
            r3 = 0
            r4 = r3
        L1f:
            int r5 = r0.length     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            if (r4 >= r5) goto L37
            java.util.HashMap[] r5 = r8.f16653c     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            r6.<init>()     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            r5[r4] = r6     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            int r4 = r4 + 1
            goto L1f
        L2e:
            r9 = move-exception
            goto Lb3
        L31:
            r9 = move-exception
            goto Lab
        L34:
            r9 = move-exception
            goto Lab
        L37:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            r4 = 5000(0x1388, float:7.006E-42)
            r0.<init>(r9, r4)     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            int r9 = r8.f(r0)     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            r8.f16652b = r9     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            r4 = 14
            r5 = 13
            r6 = 9
            r7 = 4
            if (r9 == r7) goto L84
            if (r9 == r6) goto L84
            if (r9 == r5) goto L84
            if (r9 != r4) goto L54
            goto L84
        L54:
            u5.f r9 = new u5.f     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            int r0 = r8.f16652b     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            r3 = 12
            if (r0 == r3) goto L77
            r3 = 15
            if (r0 != r3) goto L64
            goto L77
        L64:
            r3 = 7
            if (r0 != r3) goto L6b
            r8.g(r9)     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            goto L7a
        L6b:
            r3 = 10
            if (r0 != r3) goto L73
            r8.k(r9)     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            goto L7a
        L73:
            r8.j(r9)     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            goto L7a
        L77:
            r8.d(r9, r0)     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
        L7a:
            int r0 = r8.f16657g     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            long r3 = (long) r0     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            r9.e(r3)     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            r8.u(r9)     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            goto La2
        L84:
            u5.b r9 = new u5.b     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            int r0 = r8.f16652b     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            if (r0 != r7) goto L91
            r8.e(r9, r3, r3)     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            goto La2
        L91:
            if (r0 != r5) goto L97
            r8.h(r9)     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            goto La2
        L97:
            if (r0 != r6) goto L9d
            r8.i(r9)     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            goto La2
        L9d:
            if (r0 != r4) goto La2
            r8.l(r9)     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
        La2:
            r8.a()
            if (r2 == 0) goto Lc2
        La7:
            r8.p()
            goto Lc2
        Lab:
            if (r2 == 0) goto Lbc
            java.lang.String r0 = "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r0, r9)     // Catch: java.lang.Throwable -> L2e
            goto Lbc
        Lb3:
            r8.a()
            if (r2 == 0) goto Lbb
            r8.p()
        Lbb:
            throw r9
        Lbc:
            r8.a()
            if (r2 == 0) goto Lc2
            goto La7
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.g.<init>(k8.l):void");
    }

    public static ByteOrder q(b bVar) throws IOException {
        short s10 = bVar.readShort();
        boolean z2 = f16636l;
        if (s10 == 18761) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s10 == 19789) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s10));
    }

    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap[] mapArr = this.f16653c;
        if (strB != null && b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strB.concat("\u0000").getBytes(N);
            map.put("DateTime", new c(2, bytes, bytes.length));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", c.a(0L, this.f16655e));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", c.a(0L, this.f16655e));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", c.a(0L, this.f16655e));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", c.a(0L, this.f16655e));
        }
    }

    public final String b(String str) {
        c cVarC = c(str);
        if (cVarC != null) {
            int i10 = cVarC.f16626a;
            if (str.equals("GPSTimeStamp")) {
                if (i10 != 5 && i10 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i10);
                    return null;
                }
                e[] eVarArr = (e[]) cVarC.g(this.f16655e);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (eVar.f16634a / eVar.f16635b));
                e eVar2 = eVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (eVar2.f16634a / eVar2.f16635b));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (eVar3.f16634a / eVar3.f16635b)));
            }
            if (!L.contains(str)) {
                return cVarC.f(this.f16655e);
            }
            try {
                return Double.toString(cVarC.d(this.f16655e));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c c(String str) {
        c cVar;
        int i10;
        c cVar2;
        if ("ISOSpeedRatings".equals(str)) {
            if (f16636l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i10 = this.f16652b) != 4 && ((i10 == 9 || i10 == 15 || i10 == 12 || i10 == 13) && (cVar2 = this.f16660k) != null)) {
            return cVar2;
        }
        for (int i11 = 0; i11 < H.length; i11++) {
            c cVar3 = (c) this.f16653c[i11].get(str);
            if (cVar3 != null) {
                return cVar3;
            }
        }
        if (!"Xmp".equals(str) || (cVar = this.f16660k) == null) {
            return null;
        }
        return cVar;
    }

    public final void d(f fVar, int i10) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i10 == 15 && i11 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new a(fVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f16653c;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", c.c(this.f16655e, Integer.parseInt(strExtractMetadata)));
                }
                if (strExtractMetadata3 != null) {
                    mapArr[0].put("ImageLength", c.c(this.f16655e, Integer.parseInt(strExtractMetadata3)));
                }
                if (strExtractMetadata2 != null) {
                    int i12 = Integer.parseInt(strExtractMetadata2);
                    mapArr[0].put("Orientation", c.c(this.f16655e, i12 != 90 ? i12 != 180 ? i12 != 270 ? 1 : 8 : 3 : 6));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i13 = Integer.parseInt(strExtractMetadata4);
                    int i14 = Integer.parseInt(strExtractMetadata5);
                    if (i14 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.e(i13);
                    byte[] bArr = new byte[6];
                    fVar.readFully(bArr);
                    int i15 = i13 + 6;
                    int i16 = i14 - 6;
                    if (!Arrays.equals(bArr, O)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i16];
                    fVar.readFully(bArr2);
                    this.f16657g = i15;
                    r(0, bArr2);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i17 = Integer.parseInt(strExtractMetadata8);
                    int i18 = Integer.parseInt(strExtractMetadata9);
                    long j = i17;
                    fVar.e(j);
                    byte[] bArr3 = new byte[i18];
                    fVar.readFully(bArr3);
                    this.f16660k = new c(j, bArr3, 1, i18);
                }
                if (f16636l) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata3 + ", rotation " + strExtractMetadata2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e10) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e10);
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x016b, code lost:
    
        r23.f16623c = r22.f16655e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016f, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x009e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00a1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00a4. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0158 A[LOOP:0: B:10:0x0034->B:55:0x0158, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(u5.b r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.g.e(u5.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0163 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(java.io.BufferedInputStream r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.g.f(java.io.BufferedInputStream):int");
    }

    public final void g(f fVar) throws Throwable {
        int i10;
        int i11;
        j(fVar);
        HashMap[] mapArr = this.f16653c;
        c cVar = (c) mapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f16629d);
            fVar2.f16623c = this.f16655e;
            byte[] bArr = f16647w;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.e(0L);
            byte[] bArr3 = f16648x;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.e(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.e(12L);
            }
            s(fVar2, 6);
            c cVar2 = (c) mapArr[7].get("PreviewImageStart");
            c cVar3 = (c) mapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", cVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) mapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.g(this.f16655e);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                c cVarC = c.c(this.f16655e, i14);
                c cVarC2 = c.c(this.f16655e, i15);
                mapArr[0].put("ImageWidth", cVarC);
                mapArr[0].put("ImageLength", cVarC2);
            }
        }
    }

    public final void h(b bVar) throws Throwable {
        if (f16636l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f16623c = ByteOrder.BIG_ENDIAN;
        int i10 = bVar.f16622b;
        bVar.b(f16649y.length);
        boolean z2 = false;
        boolean z10 = false;
        while (true) {
            if (z2 && z10) {
                return;
            }
            try {
                int i11 = bVar.readInt();
                int i12 = bVar.readInt();
                int i13 = bVar.f16622b;
                int i14 = i13 + i11 + 4;
                int i15 = i13 - i10;
                if (i15 == 16 && i12 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i12 == 1229278788) {
                    return;
                }
                if (i12 == 1700284774 && !z2) {
                    this.f16657g = i15;
                    byte[] bArr = new byte[i11];
                    bVar.readFully(bArr);
                    int i16 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(i12 >>> 24);
                    crc32.update(i12 >>> 16);
                    crc32.update(i12 >>> 8);
                    crc32.update(i12);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i16) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i16 + ", calculated CRC value: " + crc32.getValue());
                    }
                    r(0, bArr);
                    x();
                    u(new b(bArr));
                    z2 = true;
                } else if (i12 == 1767135348 && !z10) {
                    byte[] bArr2 = f16650z;
                    if (i11 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        bVar.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i17 = bVar.f16622b - i10;
                            int i18 = i11 - length;
                            byte[] bArr4 = new byte[i18];
                            bVar.readFully(bArr4);
                            this.f16660k = new c(i17, bArr4, 1, i18);
                            z10 = true;
                        }
                    }
                }
                bVar.b(i14 - bVar.f16622b);
            } catch (EOFException e10) {
                throw new IOException("Encountered corrupt PNG file.", e10);
            }
        }
    }

    public final void i(b bVar) throws Throwable {
        boolean z2 = f16636l;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.b(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.b(i10 - bVar.f16622b);
        bVar.readFully(bArr4);
        e(new b(bArr4), i10, 5);
        bVar.b(i12 - bVar.f16622b);
        bVar.f16623c = ByteOrder.BIG_ENDIAN;
        int i13 = bVar.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i13);
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == G.f16630a) {
                short s10 = bVar.readShort();
                short s11 = bVar.readShort();
                c cVarC = c.c(this.f16655e, s10);
                c cVarC2 = c.c(this.f16655e, s11);
                HashMap[] mapArr = this.f16653c;
                mapArr[0].put("ImageLength", cVarC);
                mapArr[0].put("ImageWidth", cVarC2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s10) + ", width: " + ((int) s11));
                    return;
                }
                return;
            }
            bVar.b(unsignedShort2);
        }
    }

    public final void j(f fVar) throws Throwable {
        o(fVar);
        s(fVar, 0);
        w(fVar, 0);
        w(fVar, 5);
        w(fVar, 4);
        x();
        if (this.f16652b == 8) {
            HashMap[] mapArr = this.f16653c;
            c cVar = (c) mapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f16629d);
                fVar2.f16623c = this.f16655e;
                fVar2.b(6);
                s(fVar2, 9);
                c cVar2 = (c) mapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    mapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void k(f fVar) throws Throwable {
        if (f16636l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        j(fVar);
        HashMap[] mapArr = this.f16653c;
        c cVar = (c) mapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            e(new b(cVar.f16629d), (int) cVar.f16628c, 5);
        }
        c cVar2 = (c) mapArr[0].get("ISO");
        c cVar3 = (c) mapArr[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", cVar2);
    }

    public final void l(b bVar) throws Throwable {
        if (f16636l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f16623c = ByteOrder.LITTLE_ENDIAN;
        bVar.b(A.length);
        int i10 = bVar.readInt() + 8;
        byte[] bArr = B;
        bVar.b(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i11 = bVar.readInt();
                int i12 = length + 8;
                if (Arrays.equals(C, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i11];
                    bVar.readFully(bArrCopyOfRange);
                    byte[] bArr3 = O;
                    if (l.p(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i11);
                    }
                    this.f16657g = i12;
                    r(0, bArrCopyOfRange);
                    u(new b(bArrCopyOfRange));
                    return;
                }
                if (i11 % 2 == 1) {
                    i11++;
                }
                length = i12 + i11;
                if (length == i10) {
                    return;
                }
                if (length > i10) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.b(i11);
            } catch (EOFException e10) {
                throw new IOException("Encountered corrupt WebP file.", e10);
            }
        }
    }

    public final void m(b bVar, HashMap map) throws Throwable {
        c cVar = (c) map.get("JPEGInterchangeFormat");
        c cVar2 = (c) map.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int iE = cVar.e(this.f16655e);
        int iE2 = cVar2.e(this.f16655e);
        if (this.f16652b == 7) {
            iE += this.f16658h;
        }
        if (iE > 0 && iE2 > 0 && this.f16651a == null) {
            bVar.b(iE);
            bVar.readFully(new byte[iE2]);
        }
        if (f16636l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iE + ", length: " + iE2);
        }
    }

    public final boolean n(HashMap map) {
        c cVar = (c) map.get("ImageLength");
        c cVar2 = (c) map.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.e(this.f16655e) <= 512 && cVar2.e(this.f16655e) <= 512;
    }

    public final void o(f fVar) throws IOException {
        ByteOrder byteOrderQ = q(fVar);
        this.f16655e = byteOrderQ;
        fVar.f16623c = byteOrderQ;
        int unsignedShort = fVar.readUnsignedShort();
        int i10 = this.f16652b;
        if (i10 != 7 && i10 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i11 = fVar.readInt();
        if (i11 < 8) {
            throw new IOException(m6.a.d(i11, "Invalid first Ifd offset: "));
        }
        int i12 = i11 - 8;
        if (i12 > 0) {
            fVar.b(i12);
        }
    }

    public final void p() {
        int i10 = 0;
        while (true) {
            HashMap[] mapArr = this.f16653c;
            if (i10 >= mapArr.length) {
                return;
            }
            StringBuilder sbP = gk.b.p(i10, "The size of tag group[", "]: ");
            sbP.append(mapArr[i10].size());
            Log.d("ExifInterface", sbP.toString());
            for (Map.Entry entry : mapArr[i10].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.f(this.f16655e) + "'");
            }
            i10++;
        }
    }

    public final void r(int i10, byte[] bArr) throws IOException {
        f fVar = new f(bArr);
        o(fVar);
        s(fVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(u5.f r30, int r31) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.g.s(u5.f, int):void");
    }

    public final void t(int i10, String str, String str2) {
        HashMap[] mapArr = this.f16653c;
        if (mapArr[i10].isEmpty() || mapArr[i10].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i10];
        map.put(str2, (c) map.get(str));
        mapArr[i10].remove(str);
    }

    public final void u(b bVar) throws Throwable {
        c cVar;
        int iE;
        HashMap map = this.f16653c[4];
        c cVar2 = (c) map.get("Compression");
        if (cVar2 == null) {
            m(bVar, map);
            return;
        }
        int iE2 = cVar2.e(this.f16655e);
        if (iE2 != 1) {
            if (iE2 == 6) {
                m(bVar, map);
                return;
            } else if (iE2 != 7) {
                return;
            }
        }
        c cVar3 = (c) map.get("BitsPerSample");
        if (cVar3 != null) {
            int[] iArr = (int[]) cVar3.g(this.f16655e);
            int[] iArr2 = f16639o;
            if (Arrays.equals(iArr2, iArr) || (this.f16652b == 3 && (cVar = (c) map.get("PhotometricInterpretation")) != null && (((iE = cVar.e(this.f16655e)) == 1 && Arrays.equals(iArr, f16640p)) || (iE == 6 && Arrays.equals(iArr, iArr2))))) {
                c cVar4 = (c) map.get("StripOffsets");
                c cVar5 = (c) map.get("StripByteCounts");
                if (cVar4 == null || cVar5 == null) {
                    return;
                }
                long[] jArrD = l.d(cVar4.g(this.f16655e));
                long[] jArrD2 = l.d(cVar5.g(this.f16655e));
                if (jArrD == null || jArrD.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrD2 == null || jArrD2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrD.length != jArrD2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j4 : jArrD2) {
                    j += j4;
                }
                byte[] bArr = new byte[(int) j];
                this.f16656f = true;
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < jArrD.length; i12++) {
                    int i13 = (int) jArrD[i12];
                    int i14 = (int) jArrD2[i12];
                    if (i12 < jArrD.length - 1 && i13 + i14 != jArrD[i12 + 1]) {
                        this.f16656f = false;
                    }
                    int i15 = i13 - i10;
                    if (i15 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        bVar.b(i15);
                        int i16 = i10 + i15;
                        byte[] bArr2 = new byte[i14];
                        try {
                            bVar.readFully(bArr2);
                            i10 = i16 + i14;
                            System.arraycopy(bArr2, 0, bArr, i11, i14);
                            i11 += i14;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i14 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i15 + " bytes.");
                        return;
                    }
                }
                if (this.f16656f) {
                    long j10 = jArrD[0];
                    return;
                }
                return;
            }
        }
        if (f16636l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void v(int i10, int i11) throws Throwable {
        HashMap[] mapArr = this.f16653c;
        boolean zIsEmpty = mapArr[i10].isEmpty();
        boolean z2 = f16636l;
        if (zIsEmpty || mapArr[i11].isEmpty()) {
            if (z2) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) mapArr[i10].get("ImageLength");
        c cVar2 = (c) mapArr[i10].get("ImageWidth");
        c cVar3 = (c) mapArr[i11].get("ImageLength");
        c cVar4 = (c) mapArr[i11].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iE = cVar.e(this.f16655e);
        int iE2 = cVar2.e(this.f16655e);
        int iE3 = cVar3.e(this.f16655e);
        int iE4 = cVar4.e(this.f16655e);
        if (iE >= iE3 || iE2 >= iE4) {
            return;
        }
        HashMap map = mapArr[i10];
        mapArr[i10] = mapArr[i11];
        mapArr[i11] = map;
    }

    public final void w(f fVar, int i10) throws Throwable {
        c cVarC;
        c cVarC2;
        HashMap[] mapArr = this.f16653c;
        c cVar = (c) mapArr[i10].get("DefaultCropSize");
        c cVar2 = (c) mapArr[i10].get("SensorTopBorder");
        c cVar3 = (c) mapArr[i10].get("SensorLeftBorder");
        c cVar4 = (c) mapArr[i10].get("SensorBottomBorder");
        c cVar5 = (c) mapArr[i10].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.f16626a == 5) {
                e[] eVarArr = (e[]) cVar.g(this.f16655e);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
                cVarC = c.b(eVarArr[0], this.f16655e);
                cVarC2 = c.b(eVarArr[1], this.f16655e);
            } else {
                int[] iArr = (int[]) cVar.g(this.f16655e);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                } else {
                    cVarC = c.c(this.f16655e, iArr[0]);
                    cVarC2 = c.c(this.f16655e, iArr[1]);
                }
            }
            mapArr[i10].put("ImageWidth", cVarC);
            mapArr[i10].put("ImageLength", cVarC2);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int iE = cVar2.e(this.f16655e);
            int iE2 = cVar4.e(this.f16655e);
            int iE3 = cVar5.e(this.f16655e);
            int iE4 = cVar3.e(this.f16655e);
            if (iE2 <= iE || iE3 <= iE4) {
                return;
            }
            c cVarC3 = c.c(this.f16655e, iE2 - iE);
            c cVarC4 = c.c(this.f16655e, iE3 - iE4);
            mapArr[i10].put("ImageLength", cVarC3);
            mapArr[i10].put("ImageWidth", cVarC4);
            return;
        }
        c cVar6 = (c) mapArr[i10].get("ImageLength");
        c cVar7 = (c) mapArr[i10].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = (c) mapArr[i10].get("JPEGInterchangeFormat");
            c cVar9 = (c) mapArr[i10].get("JPEGInterchangeFormatLength");
            if (cVar8 == null || cVar9 == null) {
                return;
            }
            int iE5 = cVar8.e(this.f16655e);
            int iE6 = cVar8.e(this.f16655e);
            fVar.e(iE5);
            byte[] bArr = new byte[iE6];
            fVar.readFully(bArr);
            e(new b(bArr), iE5, i10);
        }
    }

    public final void x() throws Throwable {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] mapArr = this.f16653c;
        c cVar = (c) mapArr[1].get("PixelXDimension");
        c cVar2 = (c) mapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            mapArr[0].put("ImageWidth", cVar);
            mapArr[0].put("ImageLength", cVar2);
        }
        if (mapArr[4].isEmpty() && n(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!n(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t(0, "ThumbnailOrientation", "Orientation");
        t(0, "ThumbnailImageLength", "ImageLength");
        t(0, "ThumbnailImageWidth", "ImageWidth");
        t(5, "ThumbnailOrientation", "Orientation");
        t(5, "ThumbnailImageLength", "ImageLength");
        t(5, "ThumbnailImageWidth", "ImageWidth");
        t(4, "Orientation", "ThumbnailOrientation");
        t(4, "ImageLength", "ThumbnailImageLength");
        t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
