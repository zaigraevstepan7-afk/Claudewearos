package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h1 extends j1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f941b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(Unsafe unsafe, int i10) {
        super(unsafe);
        this.f941b = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final boolean c(long j, Object obj) {
        switch (this.f941b) {
            case 0:
                if (!k1.f964g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!k1.f964g) {
                    break;
                } else {
                    break;
                }
        }
        return k1.c(j, obj);
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final double d(long j, Object obj) {
        switch (this.f941b) {
        }
        return Double.longBitsToDouble(g(j, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final float e(long j, Object obj) {
        switch (this.f941b) {
        }
        return Float.intBitsToFloat(f(j, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final void j(Object obj, long j, boolean z2) {
        switch (this.f941b) {
            case 0:
                if (!k1.f964g) {
                    k1.l(obj, j, z2 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    k1.k(obj, j, z2 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!k1.f964g) {
                    k1.l(obj, j, z2 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    k1.k(obj, j, z2 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final void k(Object obj, long j, byte b10) {
        switch (this.f941b) {
            case 0:
                if (!k1.f964g) {
                    k1.l(obj, j, b10);
                    break;
                } else {
                    k1.k(obj, j, b10);
                    break;
                }
            default:
                if (!k1.f964g) {
                    k1.l(obj, j, b10);
                    break;
                } else {
                    k1.k(obj, j, b10);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final void l(Object obj, long j, double d10) {
        switch (this.f941b) {
            case 0:
                o(obj, j, Double.doubleToLongBits(d10));
                break;
            default:
                o(obj, j, Double.doubleToLongBits(d10));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final void m(Object obj, long j, float f10) {
        switch (this.f941b) {
            case 0:
                n(obj, Float.floatToIntBits(f10), j);
                break;
            default:
                n(obj, Float.floatToIntBits(f10), j);
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final boolean r() {
        switch (this.f941b) {
        }
        return false;
    }
}
