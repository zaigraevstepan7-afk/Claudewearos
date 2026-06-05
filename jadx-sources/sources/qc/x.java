package qc;

import com.google.android.gms.internal.ads.zzapx;
import com.google.android.gms.internal.ads.zzaqb;
import com.google.android.gms.internal.ads.zzaqh;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzcai;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x extends zzaqb {

    /* renamed from: a, reason: collision with root package name */
    public final zzcai f13470a;

    /* renamed from: b, reason: collision with root package name */
    public final rc.h f13471b;

    public x(String str, zzcai zzcaiVar) throws IOException {
        super(0, str, new ld.i(zzcaiVar, 17));
        this.f13470a = zzcaiVar;
        rc.h hVar = new rc.h();
        this.f13471b = hVar;
        if (rc.h.c()) {
            Object obj = null;
            hVar.d("onNetworkRequest", new wh.s(str, "GET", obj, obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final zzaqh zzh(zzapx zzapxVar) {
        return zzaqh.zzb(zzapxVar, zzaqy.zzb(zzapxVar));
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final void zzo(Object obj) throws IOException {
        zzapx zzapxVar = (zzapx) obj;
        Map map = zzapxVar.zzc;
        int i10 = zzapxVar.zza;
        rc.h hVar = this.f13471b;
        hVar.getClass();
        if (rc.h.c()) {
            hVar.d("onNetworkResponse", new k4.d(i10, map));
            if (i10 < 200 || i10 >= 300) {
                hVar.d("onNetworkRequestError", new rc.f(null));
            }
        }
        byte[] bArr = zzapxVar.zzb;
        if (rc.h.c() && bArr != null) {
            hVar.d("onNetworkResponseBody", new d8.e(bArr));
        }
        this.f13470a.zzc(zzapxVar);
    }
}
