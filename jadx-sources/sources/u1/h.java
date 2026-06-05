package u1;

import com.google.android.gms.common.api.internal.i0;
import java.util.ArrayList;
import java.util.List;
import qi.q;
import qi.x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final a f16573a;

    public h(a aVar) {
        this.f16573a = aVar;
        if (aVar.f16560b) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = aVar.f16559a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            c cVar = (c) list.get(i10);
            int i12 = cVar.f16564a;
            int i13 = 0;
            while (true) {
                if (i13 >= 9) {
                    i13 = -1;
                    break;
                } else if (i12 == iArr[i13]) {
                    break;
                } else {
                    i13++;
                }
            }
            if (!(i13 >= 0)) {
                if (cVar.f16564a == 100) {
                    int i14 = i10 + 2;
                    if (i14 < size && ((c) list.get(i14)).f16564a == 1000) {
                        break;
                    } else {
                        q.v0(arrayList);
                    }
                } else {
                    arrayList.add(cVar);
                }
            }
            i10 = i11;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i15 = 0; i15 < size2; i15++) {
            stackTraceElementArr[i15] = new StackTraceElement("$$compose", "m$" + ((c) arrayList.get(i15)).f16564a, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Throwable
    public final String getMessage() {
        a aVar = this.f16573a;
        if (!aVar.f16560b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb2 = new StringBuilder("Composition stack when thrown:\n");
        ri.c cVarR = yd.f.r();
        List list = aVar.f16559a;
        fj.l.f(list, "<this>");
        x xVar = new x(list);
        int iB = xVar.b();
        String str = null;
        String str2 = null;
        for (int i10 = 0; i10 < iB; i10++) {
            c cVar = (c) xVar.get(i10);
            i0 i0Var = cVar.f16565b;
            Integer num = cVar.f16566c;
            if (i0Var != null) {
                boolean z2 = i0Var.f3551a;
                String str3 = (String) i0Var.f3552b;
                if (str3 == null) {
                    String str4 = z2 ? "<lambda>" : null;
                    if (str4 != null) {
                        str = str4;
                    } else if (str == null) {
                        str = "<unknown function>";
                    }
                } else {
                    str = str3;
                }
                String str5 = (String) i0Var.f3553c;
                if (str5 != null) {
                    str2 = str5;
                } else if (str2 == null) {
                    str2 = "<unknown file>";
                }
                ?? r15 = i0Var.f3556f;
                String str6 = str + '(' + str2 + ':' + ((num == null || num.intValue() >= r15.size()) ? "<unknown line>" : String.valueOf(((j) r15.get(num.intValue())).f16575a)) + ')';
                if (!z2) {
                }
                if (!fj.l.b(str3, "rememberCompositionContext") || !fj.l.b((String) i0Var.f3555e, "9igjgp")) {
                    cVarR.add(str6);
                }
            }
        }
        ri.c cVarM = yd.f.m(cVarR);
        fj.l.f(cVarM, "<this>");
        x xVar2 = new x(cVarM);
        int iB2 = xVar2.b();
        for (int i11 = 0; i11 < iB2; i11++) {
            String str7 = (String) xVar2.get(i11);
            sb2.append("\tat ");
            sb2.append(str7);
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
