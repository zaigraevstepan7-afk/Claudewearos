package xc;

import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.zzchg;
import com.google.android.gms.internal.ads.zzhfy;
import com.google.android.gms.internal.ads.zzhgh;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z implements zzhfy {

    /* renamed from: a, reason: collision with root package name */
    public final zzchg f20040a;

    /* renamed from: b, reason: collision with root package name */
    public final zzhgh f20041b;

    /* renamed from: c, reason: collision with root package name */
    public final zzhgh f20042c;

    /* renamed from: d, reason: collision with root package name */
    public final zzhgh f20043d;

    /* renamed from: e, reason: collision with root package name */
    public final zzhgh f20044e;

    public z(zzchg zzchgVar, zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3, zzhgh zzhghVar4) {
        this.f20040a = zzchgVar;
        this.f20041b = zzhghVar;
        this.f20042c = zzhghVar2;
        this.f20043d = zzhghVar3;
        this.f20044e = zzhghVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new o(this.f20040a.zza(), ((Long) this.f20041b.zzb()).longValue(), (PackageInfo) this.f20042c.zzb(), (a0) this.f20043d.zzb(), (ScheduledExecutorService) this.f20044e.zzb());
    }
}
