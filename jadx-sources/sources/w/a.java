package w;

import ej.j;
import f1.i0;
import pi.o;
import v1.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements j {
    @Override // ej.j
    public final Object d(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, Object obj5, Integer num) {
        int i10;
        String str = (String) obj;
        boolean zBooleanValue = bool.booleanValue();
        c cVar = (c) obj2;
        ej.f fVar = (ej.f) obj3;
        ej.a aVar = (ej.a) obj4;
        i0 i0Var = (i0) obj5;
        int iIntValue = num.intValue();
        int i11 = iIntValue & 6;
        l lVar = l.f17564b;
        if (i11 == 0) {
            i10 = (i0Var.f(lVar) ? 4 : 2) | iIntValue;
        } else {
            i10 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i10 |= i0Var.f(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i10 |= i0Var.g(zBooleanValue) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i10 |= i0Var.f(cVar) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i10 |= i0Var.h(fVar) ? 16384 : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i10 |= i0Var.h(aVar) ? 131072 : 65536;
        }
        if (i0Var.T(i10 & 1, (599187 & i10) != 599186)) {
            f.c(str, zBooleanValue, cVar, lVar, fVar, aVar, i0Var, ((i10 >> 3) & 1022) | ((i10 << 9) & 7168) | (57344 & i10) | (i10 & 458752));
        } else {
            i0Var.W();
        }
        return o.f13011a;
    }
}
