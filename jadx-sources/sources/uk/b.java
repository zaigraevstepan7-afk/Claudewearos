package uk;

import ak.v;
import ef.f;
import fj.l;
import java.util.ArrayList;
import nj.e;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final sk.a f17136a;

    public b(sk.a aVar) {
        this.f17136a = aVar;
    }

    public Object a(v vVar) throws a5.a {
        f fVar = (f) vVar.f730a;
        StringBuilder sb2 = new StringBuilder("| (+) '");
        sk.a aVar = this.f17136a;
        sb2.append(aVar);
        sb2.append('\'');
        fVar.e(sb2.toString());
        try {
            yk.a aVar2 = (yk.a) vVar.f734e;
            if (aVar2 == null) {
                aVar2 = new yk.a(null, 3);
            }
            return aVar.f15084d.invoke((cl.a) vVar.f732c, aVar2);
        } catch (Exception e10) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(e10);
            sb3.append("\n\t");
            StackTraceElement[] stackTrace = e10.getStackTrace();
            l.e(stackTrace, "getStackTrace(...)");
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                l.e(className, "getClassName(...)");
                if (e.C0(className, "sun.reflect", false)) {
                    break;
                }
                arrayList.add(stackTraceElement);
            }
            sb3.append(qi.l.E0(arrayList, "\n\t", null, null, null, 62));
            String str = "* Instance creation error : could not create instance for '" + aVar + "': " + sb3.toString();
            l.f(str, "msg");
            fVar.i(vk.a.f18137d, str);
            String str2 = "Could not create instance for '" + aVar + '\'';
            l.f(str2, "msg");
            throw new a5.a(str2, e10);
        }
    }

    public abstract Object b(v vVar);
}
