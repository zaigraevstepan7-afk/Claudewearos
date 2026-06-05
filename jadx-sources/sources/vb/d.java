package vb;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import p1.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final qh.c f18017a;

    /* renamed from: b, reason: collision with root package name */
    public final l f18018b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f18019c;

    public d(Context context, l lVar) {
        qh.c cVar = new qh.c(context);
        this.f18019c = new HashMap();
        this.f18017a = cVar;
        this.f18018b = lVar;
    }

    public final synchronized e a(String str) {
        if (this.f18019c.containsKey(str)) {
            return (e) this.f18019c.get(str);
        }
        CctBackendFactory cctBackendFactoryB = this.f18017a.B(str);
        if (cctBackendFactoryB == null) {
            return null;
        }
        l lVar = this.f18018b;
        e eVarCreate = cctBackendFactoryB.create(new b((Context) lVar.f12660b, (dc.a) lVar.f12661c, (dc.a) lVar.f12662d, str));
        this.f18019c.put(str, eVarCreate);
        return eVarCreate;
    }
}
