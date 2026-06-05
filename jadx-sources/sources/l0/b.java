package l0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import g3.m0;
import g3.y;
import java.util.List;
import n0.d;
import n0.f;
import n0.g;
import pi.o;
import q.b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final y f9842a = new y(29);

    /* renamed from: b, reason: collision with root package name */
    public static final a f9843b = new a(0);

    public static final void a(m0.a aVar, Context context, final boolean z2, final String str, final long j) {
        if (m0.c(j) || str.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        final Context context2 = context;
        List list = (List) f9842a.invoke(context2);
        if (list.isEmpty()) {
            return;
        }
        b0 b0Var = aVar.f11218a;
        b0 b0Var2 = aVar.f11218a;
        f fVar = f.f11851b;
        b0Var.a(fVar);
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i10);
            b0Var2.a(new d(new n0.a(i10), resolveInfo.loadLabel(packageManager).toString(), 0, new ej.c() { // from class: l0.c
                @Override // ej.c
                public final Object invoke(Object obj) {
                    b.f9843b.g(context2, resolveInfo, Boolean.valueOf(z2), str, new m0(j));
                    ((g) obj).close();
                    return o.f13011a;
                }
            }));
            i10++;
            context2 = context;
        }
        b0Var2.a(fVar);
    }
}
