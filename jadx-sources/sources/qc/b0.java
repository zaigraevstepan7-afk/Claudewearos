package qc;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzfjh;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b0 extends p {

    /* renamed from: a, reason: collision with root package name */
    public final rc.o f13338a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13339b;

    /* renamed from: c, reason: collision with root package name */
    public final rc.p f13340c;

    public b0(Context context, String str, String str2, rc.p pVar) {
        this.f13338a = new rc.o(mc.n.D.f11577c.y(context, str));
        this.f13339b = str2;
        this.f13340c = pVar;
    }

    @Override // qc.p
    public final void zza() {
        String str = this.f13339b;
        rc.o oVar = this.f13338a;
        rc.p pVar = this.f13340c;
        if (pVar != null) {
            new zzfjh(pVar.f14360a, oVar, zzcad.zze, null).zzd(str);
        } else {
            oVar.zza(str);
        }
    }
}
