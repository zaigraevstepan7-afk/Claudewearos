package p2;

import v2.d2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends fj.m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12692a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fj.r f12693b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(fj.r rVar) {
        super(1);
        this.f12693b = rVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f12692a) {
            case 0:
                if (!((g) obj).J) {
                    break;
                } else {
                    this.f12693b.f6803a = false;
                    break;
                }
            default:
                y1.e eVar = (y1.e) obj;
                if (!eVar.G) {
                    break;
                } else {
                    if (eVar.I != null) {
                        s2.a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                    }
                    eVar.I = null;
                    fj.r rVar = this.f12693b;
                    rVar.f6803a = rVar.f6803a;
                    break;
                }
        }
        return d2.f17606a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(w8.h hVar, y1.e eVar, fj.r rVar) {
        super(1);
        this.f12693b = rVar;
    }
}
