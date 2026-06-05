package w3;

import java.util.UUID;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends fj.m implements ej.a {

    /* renamed from: b, reason: collision with root package name */
    public static final d f18485b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f18486c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f18487d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f18488e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18489a;

    static {
        int i10 = 0;
        f18485b = new d(i10, 0);
        f18486c = new d(i10, 1);
        f18487d = new d(i10, 2);
        f18488e = new d(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, int i11) {
        super(i10);
        this.f18489a = i11;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f18489a) {
            case 0:
                return UUID.randomUUID();
            case 1:
                return Boolean.FALSE;
            case 2:
                return "DEFAULT_TEST_TAG";
            default:
                return UUID.randomUUID();
        }
    }
}
