package zc;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbuf;
import fc.g;
import nc.t;
import rc.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final f7.a f20492a;

    public a(f7.a aVar) {
        this.f20492a = aVar;
    }

    public static void a(Context context, g gVar, b bVar) {
        zzbdc.zza(context);
        if (((Boolean) zzbfa.zzj.zze()).booleanValue()) {
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzlu)).booleanValue()) {
                c.f14330b.execute(new b8.b(context, gVar, bVar, 18, false));
                return;
            }
        }
        new zzbuf(context, fc.b.BANNER, gVar.f6695a, null).zzb(bVar);
    }
}
