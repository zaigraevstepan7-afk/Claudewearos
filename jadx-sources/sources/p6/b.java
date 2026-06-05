package p6;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import c2.z;
import fj.l;
import pi.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final MeasurementManager f12802a;

    public b(Context context) {
        l.f(context, "context");
        Object systemService = context.getSystemService((Class<Object>) z.p());
        l.e(systemService, "context.getSystemService\u2026:class.java\n            )");
        this.f12802a = z.d(systemService);
    }

    public Object a(a aVar, ti.c cVar) {
        new qj.l(1, u3.a.g(cVar)).p();
        z.A();
        throw null;
    }

    public Object b(ti.c cVar) {
        qj.l lVar = new qj.l(1, u3.a.g(cVar));
        lVar.p();
        this.f12802a.getMeasurementApiStatus(new n.a(1), new p4.c(lVar));
        Object objO = lVar.o();
        ui.a aVar = ui.a.f17085a;
        return objO;
    }

    public Object c(Uri uri, InputEvent inputEvent, ti.c cVar) {
        qj.l lVar = new qj.l(1, u3.a.g(cVar));
        lVar.p();
        this.f12802a.registerSource(uri, inputEvent, new n.a(1), new p4.c(lVar));
        Object objO = lVar.o();
        return objO == ui.a.f17085a ? objO : o.f13011a;
    }

    public Object d(Uri uri, ti.c cVar) {
        qj.l lVar = new qj.l(1, u3.a.g(cVar));
        lVar.p();
        this.f12802a.registerTrigger(uri, new n.a(1), new p4.c(lVar));
        Object objO = lVar.o();
        return objO == ui.a.f17085a ? objO : o.f13011a;
    }

    public Object e(c cVar, ti.c cVar2) {
        new qj.l(1, u3.a.g(cVar2)).p();
        z.C();
        throw null;
    }

    public Object f(d dVar, ti.c cVar) {
        new qj.l(1, u3.a.g(cVar)).p();
        z.D();
        throw null;
    }
}
