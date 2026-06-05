package s4;

import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f14761a;

    /* renamed from: b, reason: collision with root package name */
    public int f14762b;

    public b(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f14761a = new Object[i10];
    }

    public Object a() {
        int i10 = this.f14762b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f14761a;
        Object obj = objArr[i11];
        l.d(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i11] = null;
        this.f14762b--;
        return obj;
    }

    public void b(y3.b bVar) {
        int i10 = this.f14762b;
        Object[] objArr = this.f14761a;
        if (i10 < objArr.length) {
            objArr[i10] = bVar;
            this.f14762b = i10 + 1;
        }
    }

    public boolean c(Object obj) {
        Object[] objArr;
        boolean z2;
        l.f(obj, "instance");
        int i10 = this.f14762b;
        int i11 = 0;
        while (true) {
            objArr = this.f14761a;
            if (i11 >= i10) {
                z2 = false;
                break;
            }
            if (objArr[i11] == obj) {
                z2 = true;
                break;
            }
            i11++;
        }
        if (z2) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i12 = this.f14762b;
        if (i12 >= objArr.length) {
            return false;
        }
        objArr[i12] = obj;
        this.f14762b = i12 + 1;
        return true;
    }

    public b() {
        this.f14761a = new Object[256];
    }
}
