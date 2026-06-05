package z5;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends ArrayList {

    /* renamed from: a, reason: collision with root package name */
    public final Class f20386a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f20387b;

    public f(Class cls, Class cls2) {
        this.f20386a = cls;
        this.f20387b = cls2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p1.l b() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.f20386a, size);
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) this.f20387b, size);
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = ((Pair) get(i10)).first;
            objArr2[i10] = ((Pair) get(i10)).second;
        }
        return new p1.l(objArr, objArr2);
    }
}
