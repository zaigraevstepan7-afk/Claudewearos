package xc;

import com.google.android.gms.internal.ads.zzddo;
import com.google.android.gms.internal.ads.zzffm;
import com.google.android.gms.internal.ads.zzgdm;
import com.google.android.gms.internal.ads.zzhfy;
import com.google.android.gms.internal.ads.zzhgh;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r implements zzhfy {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20007a;

    /* renamed from: b, reason: collision with root package name */
    public final zzhgh f20008b;

    /* renamed from: c, reason: collision with root package name */
    public final zzhgh f20009c;

    /* renamed from: d, reason: collision with root package name */
    public final zzhgh f20010d;

    public /* synthetic */ r(zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3, int i10) {
        this.f20007a = i10;
        this.f20008b = zzhghVar;
        this.f20009c = zzhghVar2;
        this.f20010d = zzhghVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f20007a) {
            case 0:
                Object obj = (m0) this.f20008b.zzb();
                Object obj2 = (w) this.f20009c.zzb();
                zzgdm zzgdmVarZzc = zzffm.zzc();
                if (((Integer) this.f20010d.zzb()).intValue() == 2) {
                    obj = obj2;
                }
                return new zzddo(obj, zzgdmVarZzc);
            default:
                return new w((o) this.f20008b.zzb(), ((Integer) this.f20009c.zzb()).intValue(), (String) this.f20010d.zzb());
        }
    }
}
