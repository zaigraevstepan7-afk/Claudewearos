package xc;

import android.content.Context;
import com.google.android.gms.internal.ads.zzchg;
import com.google.android.gms.internal.ads.zzchu;
import com.google.android.gms.internal.ads.zzckj;
import com.google.android.gms.internal.ads.zzdsh;
import com.google.android.gms.internal.ads.zzepf;
import com.google.android.gms.internal.ads.zzffm;
import com.google.android.gms.internal.ads.zzhfy;
import com.google.android.gms.internal.ads.zzhgh;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c0 implements zzhfy {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19910a;

    /* renamed from: b, reason: collision with root package name */
    public final zzchg f19911b;

    /* renamed from: c, reason: collision with root package name */
    public final zzhgh f19912c;

    public /* synthetic */ c0(zzchg zzchgVar, zzhgh zzhghVar, int i10) {
        this.f19910a = i10;
        this.f19911b = zzchgVar;
        this.f19912c = zzhghVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f19910a) {
            case 0:
                Context contextZza = this.f19911b.zza();
                zzckj.zza();
                return new b0(contextZza, zzepf.zzc(), ((zzchu) this.f19912c).zza());
            default:
                return new g0(this.f19911b.zza(), (zzdsh) this.f19912c.zzb(), zzffm.zzc());
        }
    }
}
