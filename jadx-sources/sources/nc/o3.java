package nc;

import com.google.android.gms.internal.ads.zzbmx;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o3 extends b0 {

    /* renamed from: a, reason: collision with root package name */
    public final fc.d f12159a;

    /* renamed from: b, reason: collision with root package name */
    public final zzbmx f12160b;

    public o3(fc.d dVar, zzbmx zzbmxVar) {
        this.f12159a = dVar;
        this.f12160b = zzbmxVar;
    }

    @Override // nc.c0
    public final void zzb(h2 h2Var) {
        fc.d dVar = this.f12159a;
        if (dVar != null) {
            dVar.onAdFailedToLoad(h2Var.c());
        }
    }

    @Override // nc.c0
    public final void zzc() {
        zzbmx zzbmxVar;
        fc.d dVar = this.f12159a;
        if (dVar == null || (zzbmxVar = this.f12160b) == null) {
            return;
        }
        dVar.onAdLoaded(zzbmxVar);
    }
}
