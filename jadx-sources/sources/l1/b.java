package l1;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Collection f9852b;

    public /* synthetic */ b(int i10, Collection collection) {
        this.f9851a = i10;
        this.f9852b = collection;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        boolean zContains;
        switch (this.f9851a) {
            case 0:
                zContains = this.f9852b.contains(obj);
                break;
            case 1:
                zContains = this.f9852b.contains(obj);
                break;
            default:
                zContains = ((List) obj).retainAll(this.f9852b);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
