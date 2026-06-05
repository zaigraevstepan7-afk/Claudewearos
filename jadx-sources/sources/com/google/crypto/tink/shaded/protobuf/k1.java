package com.google.crypto.tink.shaded.protobuf;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class k1 extends m1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4188b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(Unsafe unsafe, int i10) {
        super(unsafe);
        this.f4188b = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m1
    public final boolean c(long j, Object obj) {
        switch (this.f4188b) {
            case 0:
                if (n1.f4207g) {
                    if (n1.h(j, obj) == 0) {
                    }
                } else if (n1.i(j, obj) == 0) {
                }
                break;
            default:
                if (n1.f4207g) {
                    if (n1.h(j, obj) == 0) {
                    }
                } else if (n1.i(j, obj) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m1
    public final byte d(long j, Object obj) {
        switch (this.f4188b) {
            case 0:
                if (!n1.f4207g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!n1.f4207g) {
                    break;
                } else {
                    break;
                }
        }
        return n1.i(j, obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m1
    public final double e(long j, Object obj) {
        switch (this.f4188b) {
        }
        return Double.longBitsToDouble(h(j, obj));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m1
    public final float f(long j, Object obj) {
        switch (this.f4188b) {
        }
        return Float.intBitsToFloat(g(j, obj));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m1
    public final void k(Object obj, long j, boolean z2) {
        switch (this.f4188b) {
            case 0:
                if (!n1.f4207g) {
                    n1.m(obj, j, z2 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    n1.l(obj, j, z2 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!n1.f4207g) {
                    n1.m(obj, j, z2 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    n1.l(obj, j, z2 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m1
    public final void l(Object obj, long j, byte b10) {
        switch (this.f4188b) {
            case 0:
                if (!n1.f4207g) {
                    n1.m(obj, j, b10);
                    break;
                } else {
                    n1.l(obj, j, b10);
                    break;
                }
            default:
                if (!n1.f4207g) {
                    n1.m(obj, j, b10);
                    break;
                } else {
                    n1.l(obj, j, b10);
                    break;
                }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m1
    public final void m(Object obj, long j, double d10) {
        switch (this.f4188b) {
            case 0:
                p(obj, j, Double.doubleToLongBits(d10));
                break;
            default:
                p(obj, j, Double.doubleToLongBits(d10));
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m1
    public final void n(Object obj, long j, float f10) {
        switch (this.f4188b) {
            case 0:
                o(obj, Float.floatToIntBits(f10), j);
                break;
            default:
                o(obj, Float.floatToIntBits(f10), j);
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m1
    public final boolean s() {
        switch (this.f4188b) {
        }
        return false;
    }
}
