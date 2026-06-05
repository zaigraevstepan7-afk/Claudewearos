package l0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import ej.h;
import f1.i0;
import g3.m0;
import n0.g;
import p0.l;
import pi.o;
import r0.e;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9841a;

    @Override // ej.h
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10;
        int i11;
        switch (this.f9841a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                long j = ((m0) obj5).f7145a;
                String string = ((CharSequence) obj4).subSequence(m0.f(j), m0.e(j)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
            case 1:
                g gVar = (g) obj;
                e eVar = (e) obj2;
                ej.a aVar = (ej.a) obj3;
                i0 i0Var = (i0) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                if ((iIntValue & 6) == 0) {
                    i10 = ((iIntValue & 8) == 0 ? i0Var.f(gVar) : i0Var.h(gVar) ? 4 : 2) | iIntValue;
                } else {
                    i10 = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i10 |= (iIntValue & 64) == 0 ? i0Var.f(eVar) : i0Var.h(eVar) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i10 |= i0Var.h(aVar) ? 256 : 128;
                }
                if (i0Var.T(i10 & 1, (i10 & 1171) != 1170)) {
                    l.c(gVar, eVar, aVar, i0Var, i10 & 1022);
                } else {
                    i0Var.W();
                }
                break;
            default:
                g gVar2 = (g) obj;
                e eVar2 = (e) obj2;
                ej.a aVar2 = (ej.a) obj3;
                i0 i0Var2 = (i0) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i11 = ((iIntValue2 & 8) == 0 ? i0Var2.f(gVar2) : i0Var2.h(gVar2) ? 4 : 2) | iIntValue2;
                } else {
                    i11 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i11 |= (iIntValue2 & 64) == 0 ? i0Var2.f(eVar2) : i0Var2.h(eVar2) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i11 |= i0Var2.h(aVar2) ? 256 : 128;
                }
                if (i0Var2.T(i11 & 1, (i11 & 1171) != 1170)) {
                    l.c(gVar2, eVar2, aVar2, i0Var2, i11 & 1022);
                } else {
                    i0Var2.W();
                }
                break;
        }
        return o.f13011a;
    }
}
