package fc;

import android.content.Context;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.internal.ads.zzbpk;
import nc.i0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6691a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f6692b;

    public e(Context context, String str) {
        e0.j(context, "context cannot be null");
        nc.p pVar = nc.s.f12202f.f12204b;
        zzbpk zzbpkVar = new zzbpk();
        pVar.getClass();
        i0 i0Var = (i0) new nc.l(pVar, context, str, zzbpkVar).d(context, false);
        this.f6691a = context;
        this.f6692b = i0Var;
    }
}
