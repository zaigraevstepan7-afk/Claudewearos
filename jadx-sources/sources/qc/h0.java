package qc;

import com.google.android.gms.internal.ads.zzchg;
import com.google.android.gms.internal.ads.zzhfy;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h0 implements zzhfy {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13366a;

    /* renamed from: b, reason: collision with root package name */
    public final zzchg f13367b;

    public /* synthetic */ h0(zzchg zzchgVar, int i10) {
        this.f13366a = i10;
        this.f13367b = zzchgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f13366a) {
            case 0:
                return new g0(this.f13367b.zza());
            default:
                return new xc.a0(this.f13367b.zza());
        }
    }
}
