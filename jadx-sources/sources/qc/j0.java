package qc;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: b, reason: collision with root package name */
    public static List f13381b;

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f13380a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final Object f13382c = new Object();

    public static List a(String str) {
        ArrayList arrayList;
        Object obj = f13382c;
        synchronized (obj) {
            HashMap map = f13380a;
            if (map.containsKey(str)) {
                return (List) map.get(str);
            }
            try {
                synchronized (obj) {
                    try {
                        if (f13381b == null) {
                            f13381b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        }
                        arrayList = new ArrayList();
                        for (MediaCodecInfo mediaCodecInfo : f13381b) {
                            if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                                HashMap map2 = new HashMap();
                                map2.put("codecName", mediaCodecInfo.getName());
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                                ArrayList arrayList2 = new ArrayList();
                                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                    arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                                }
                                map2.put("profileLevels", arrayList2);
                                MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                                if (videoCapabilities != null) {
                                    map2.put("bitRatesBps", b(videoCapabilities.getBitrateRange()));
                                    map2.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                                    map2.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                                    map2.put("frameRates", b(videoCapabilities.getSupportedFrameRates()));
                                    map2.put("widths", b(videoCapabilities.getSupportedWidths()));
                                    map2.put("heights", b(videoCapabilities.getSupportedHeights()));
                                }
                                map2.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                                arrayList.add(map2);
                            }
                        }
                        f13380a.put(str, arrayList);
                    } finally {
                    }
                }
                return arrayList;
            } catch (LinkageError e10) {
                e = e10;
                HashMap map3 = new HashMap();
                map3.put("error", e.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(map3);
                f13380a.put(str, arrayList3);
                return arrayList3;
            } catch (RuntimeException e11) {
                e = e11;
                HashMap map32 = new HashMap();
                map32.put("error", e.getClass().getSimpleName());
                ArrayList arrayList32 = new ArrayList();
                arrayList32.add(map32);
                f13380a.put(str, arrayList32);
                return arrayList32;
            }
        }
    }

    public static Integer[] b(Range range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }
}
