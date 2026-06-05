package c1;

import com.google.android.gms.internal.ads.zzbch;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class b8 implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f1947b;

    public /* synthetic */ b8(f1.a1 a1Var, int i10) {
        this.f1946a = i10;
        this.f1947b = a1Var;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f1946a) {
            case 0:
                return (t2.w) this.f1947b.getValue();
            case 1:
                this.f1947b.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return pi.o.f13011a;
            case 2:
                return new d0.h((ej.c) this.f1947b.getValue());
            case 3:
                return new e0.g((ej.c) this.f1947b.getValue());
            case 4:
                return (f0.b0) ((ej.a) this.f1947b.getValue()).a();
            case 5:
                f1.a1 a1Var = this.f1947b;
                if (a1Var != null) {
                    return (List) a1Var.getValue();
                }
                return null;
            case 6:
                Boolean bool = (Boolean) this.f1947b.getValue();
                bool.booleanValue();
                return bool;
            case 7:
                this.f1947b.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return pi.o.f13011a;
            case 8:
                this.f1947b.setValue(Boolean.TRUE);
                return pi.o.f13011a;
            case 9:
                this.f1947b.setValue(Boolean.FALSE);
                return pi.o.f13011a;
            case 10:
                this.f1947b.setValue(Boolean.FALSE);
                return pi.o.f13011a;
            case 11:
                this.f1947b.setValue(Boolean.TRUE);
                return pi.o.f13011a;
            case 12:
                this.f1947b.setValue(Boolean.FALSE);
                return pi.o.f13011a;
            case 13:
                this.f1947b.setValue(Boolean.FALSE);
                return pi.o.f13011a;
            case 14:
                this.f1947b.setValue(Boolean.FALSE);
                return pi.o.f13011a;
            case 15:
                this.f1947b.setValue(Boolean.FALSE);
                return pi.o.f13011a;
            case 16:
                this.f1947b.setValue(Boolean.FALSE);
                return pi.o.f13011a;
            case 17:
                this.f1947b.setValue(Boolean.FALSE);
                return pi.o.f13011a;
            case 18:
                this.f1947b.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return pi.o.f13011a;
            case 19:
                this.f1947b.setValue(Boolean.TRUE);
                return pi.o.f13011a;
            case 20:
                this.f1947b.setValue(Boolean.FALSE);
                return pi.o.f13011a;
            case zzbch.zzt.zzm /* 21 */:
                this.f1947b.setValue(Boolean.FALSE);
                return pi.o.f13011a;
            case 22:
                this.f1947b.setValue(Boolean.TRUE);
                return pi.o.f13011a;
            case 23:
                this.f1947b.setValue(Boolean.FALSE);
                return pi.o.f13011a;
            case 24:
                this.f1947b.setValue(Boolean.FALSE);
                return pi.o.f13011a;
            case 25:
                this.f1947b.setValue(null);
                return pi.o.f13011a;
            case 26:
                this.f1947b.setValue(Boolean.TRUE);
                return pi.o.f13011a;
            case 27:
                this.f1947b.setValue(Boolean.FALSE);
                return pi.o.f13011a;
            case 28:
                t2.w wVar = (t2.w) this.f1947b.getValue();
                if (wVar != null) {
                    return wVar;
                }
                a0.a.d("Required value was null.");
                throw new b3.e();
            default:
                t2.w wVar2 = (t2.w) this.f1947b.getValue();
                if (wVar2 != null) {
                    return wVar2;
                }
                a0.a.d("Required value was null.");
                throw new b3.e();
        }
    }
}
