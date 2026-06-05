package fc;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbpk;
import nc.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static volatile x0 f6720a;

    /* renamed from: b, reason: collision with root package name */
    public static final nd.d f6721b;

    /* renamed from: c, reason: collision with root package name */
    public static final nd.d[] f6722c;

    static {
        nd.d dVar = new nd.d("additional_video_csi", 1L);
        f6721b = dVar;
        f6722c = new nd.d[]{dVar};
    }

    public static x0 a(Context context) {
        if (f6720a == null) {
            synchronized (y.class) {
                try {
                    if (f6720a == null) {
                        nc.p pVar = nc.s.f12202f.f12204b;
                        zzbpk zzbpkVar = new zzbpk();
                        pVar.getClass();
                        f6720a = (x0) new nc.m(pVar, context, zzbpkVar).d(context, false);
                    }
                } finally {
                }
            }
        }
        return f6720a;
    }
}
