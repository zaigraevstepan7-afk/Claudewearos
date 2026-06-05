package xc;

import com.google.android.gms.internal.ads.zzdsh;
import com.google.android.gms.internal.ads.zzdxh;
import com.google.android.gms.internal.ads.zzffm;
import com.google.android.gms.internal.ads.zzhfy;
import com.google.android.gms.internal.ads.zzhgh;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u implements zzhfy {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20022a;

    /* renamed from: b, reason: collision with root package name */
    public final zzhgh f20023b;

    public /* synthetic */ u(zzhgh zzhghVar, int i10) {
        this.f20022a = i10;
        this.f20023b = zzhghVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final Object zzb() {
        switch (this.f20022a) {
            case 0:
                return new t(zzffm.zzc(), ((zzdxh) this.f20023b).zzb());
            default:
                return new l0((zzdsh) this.f20023b.zzb());
        }
    }
}
