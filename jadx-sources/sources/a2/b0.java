package a2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b0 implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f10a;

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f11b;

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f12c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b0[] f13d;

    static {
        b0 b0Var = new b0("Active", 0);
        f10a = b0Var;
        b0 b0Var2 = new b0("ActiveParent", 1);
        f11b = b0Var2;
        b0 b0Var3 = new b0("Captured", 2);
        b0 b0Var4 = new b0("Inactive", 3);
        f12c = b0Var4;
        b0[] b0VarArr = {b0Var, b0Var2, b0Var3, b0Var4};
        f13d = b0VarArr;
        u0.c.j(b0VarArr);
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f13d.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                throw new b3.e();
            }
        }
        return true;
    }
}
