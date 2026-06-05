package t;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final r0 f15268a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ r0[] f15269b;

    static {
        r0 r0Var = new r0("Restart", 0);
        f15268a = r0Var;
        r0[] r0VarArr = {r0Var, new r0("Reverse", 1)};
        f15269b = r0VarArr;
        u0.c.j(r0VarArr);
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) f15269b.clone();
    }
}
