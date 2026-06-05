package mb;

import f1.i0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11475a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f11476b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11477c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11478d;

    public /* synthetic */ m(float f10, int i10, ej.a aVar) {
        this.f11476b = f10;
        this.f11478d = aVar;
        this.f11477c = i10;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11475a) {
            case 0:
                ((Integer) obj2).getClass();
                int iO = f1.s.O(1);
                a.h(this.f11477c, this.f11476b, (v1.o) this.f11478d, (i0) obj, iO);
                break;
            default:
                ((Integer) obj2).intValue();
                int iO2 = f1.s.O(this.f11477c | 1);
                y8.a.a(this.f11476b, (ej.a) this.f11478d, (i0) obj, iO2);
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ m(int i10, float f10, v1.o oVar, int i11) {
        this.f11477c = i10;
        this.f11476b = f10;
        this.f11478d = oVar;
    }
}
