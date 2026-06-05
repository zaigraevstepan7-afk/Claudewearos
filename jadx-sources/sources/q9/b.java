package q9;

import android.content.Context;
import androidx.lifecycle.h0;
import fj.l;
import java.io.File;
import m5.d0;
import m5.z;
import qi.s;
import qj.b0;
import qj.m0;
import vj.d;
import xj.e;
import yd.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13312a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f13313b;

    public /* synthetic */ b(c cVar, int i10) {
        this.f13312a = i10;
        this.f13313b = cVar;
    }

    @Override // ej.a
    public final Object a() {
        int i10 = this.f13312a;
        c cVar = this.f13313b;
        switch (i10) {
            case 0:
                e eVar = m0.f13601a;
                d dVarB = b0.b(xj.d.f20094c);
                new z(new d0(new a7.e(new b(cVar, 1), 29)), f.K(new h0(s.f13520a, (ti.c) null, 17)), new p9.a(8), dVarB);
                return new p5.e();
            default:
                Context context = cVar.f13314a;
                String str = cVar.f13315b;
                l.f(context, "<this>");
                l.f(str, "name");
                String strConcat = str.concat(".preferences_pb");
                l.f(strConcat, "fileName");
                return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(strConcat));
        }
    }
}
