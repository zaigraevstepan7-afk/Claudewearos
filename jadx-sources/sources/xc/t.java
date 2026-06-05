package xc;

import com.google.android.gms.internal.ads.zzbvo;
import com.google.android.gms.internal.ads.zzdxg;
import com.google.android.gms.internal.ads.zzgci;
import com.google.android.gms.internal.ads.zzgdb;
import com.google.android.gms.internal.ads.zzgdm;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t implements zzgci {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f20020a;

    /* renamed from: b, reason: collision with root package name */
    public final zzdxg f20021b;

    public t(zzgdm zzgdmVar, zzdxg zzdxgVar) {
        this.f20020a = zzgdmVar;
        this.f20021b = zzdxgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgci
    public final /* bridge */ /* synthetic */ mf.a zza(Object obj) {
        zzbvo zzbvoVar = (zzbvo) obj;
        return zzgdb.zzn(this.f20021b.zzc(zzbvoVar), new g(zzbvoVar, 2), this.f20020a);
    }
}
