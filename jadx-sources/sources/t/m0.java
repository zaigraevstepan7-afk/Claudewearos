package t;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f15231a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ m0[] f15232b;

    static {
        m0 m0Var = new m0("Default", 0);
        f15231a = m0Var;
        m0[] m0VarArr = {m0Var, new m0("UserInput", 1), new m0("PreventUserInput", 2)};
        f15232b = m0VarArr;
        u0.c.j(m0VarArr);
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) f15232b.clone();
    }
}
