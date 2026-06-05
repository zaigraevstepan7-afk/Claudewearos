package l;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import w5.b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class h implements Menu {

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f9775v = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f9776a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f9777b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9778c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9779d;

    /* renamed from: e, reason: collision with root package name */
    public ld.i f9780e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f9781f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f9782g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9783h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f9784i;
    public final ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9785k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f9786l;

    /* renamed from: m, reason: collision with root package name */
    public View f9787m;

    /* renamed from: t, reason: collision with root package name */
    public i f9794t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9788n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9789o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9790p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9791q = false;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f9792r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final CopyOnWriteArrayList f9793s = new CopyOnWriteArrayList();

    /* renamed from: u, reason: collision with root package name */
    public boolean f9795u = false;

    public h(Context context) {
        boolean zR;
        boolean z2 = false;
        this.f9776a = context;
        Resources resources = context.getResources();
        this.f9777b = resources;
        this.f9781f = new ArrayList();
        this.f9782g = new ArrayList();
        this.f9783h = true;
        this.f9784i = new ArrayList();
        this.j = new ArrayList();
        this.f9785k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                zR = i4.a.r(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zR = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zR) {
                z2 = true;
            }
        }
        this.f9779d = z2;
    }

    public final i a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 < 0 || i14 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i15 = (f9775v[i14] << 16) | (65535 & i12);
        i iVar = new i(this, i10, i11, i12, i15, charSequence);
        ArrayList arrayList = this.f9781f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i13 = 0;
                break;
            }
            if (((i) arrayList.get(size)).f9799d <= i15) {
                i13 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i13, iVar);
        o(true);
        return iVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f9776a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            i iVarA = a(i10, i11, i12, resolveInfo.loadLabel(packageManager));
            iVarA.setIcon(resolveInfo.loadIcon(packageManager));
            iVarA.f9802g = intent2;
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = iVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(n nVar, Context context) {
        this.f9793s.add(new WeakReference(nVar));
        nVar.i(context, this);
        this.f9785k = true;
    }

    public final void c(boolean z2) {
        if (this.f9791q) {
            return;
        }
        this.f9791q = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f9793s;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            n nVar = (n) weakReference.get();
            if (nVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                nVar.a(this, z2);
            }
        }
        this.f9791q = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        i iVar = this.f9794t;
        if (iVar != null) {
            d(iVar);
        }
        this.f9781f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f9786l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(i iVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f9793s;
        boolean zK = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f9794t == iVar) {
            s();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                n nVar = (n) weakReference.get();
                if (nVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zK = nVar.k(iVar);
                    if (zK) {
                        break;
                    }
                }
            }
            r();
            if (zK) {
                this.f9794t = null;
            }
        }
        return zK;
    }

    public boolean e(h hVar, MenuItem menuItem) {
        m.k kVar;
        ld.i iVar = this.f9780e;
        if (iVar == null || (kVar = ((ActionMenuView) iVar.f10924b).R) == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((p7.k) kVar).f12813b).f817c0.f12661c).iterator();
        while (it.hasNext()) {
            if (((b0) it.next()).f18612a.p()) {
                return true;
            }
        }
        return false;
    }

    public boolean f(i iVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f9793s;
        boolean zB = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            n nVar = (n) weakReference.get();
            if (nVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zB = nVar.b(iVar);
                if (zB) {
                    break;
                }
            }
        }
        r();
        if (zB) {
            this.f9794t = iVar;
        }
        return zB;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f9781f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = (i) arrayList.get(i11);
            if (iVar.f9796a == i10) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (menuItemFindItem = iVar.f9809o.findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final i g(int i10, KeyEvent keyEvent) {
        ArrayList arrayList = this.f9792r;
        arrayList.clear();
        h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (i) arrayList.get(0);
        }
        boolean zM = m();
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = (i) arrayList.get(i11);
            char c6 = zM ? iVar.j : iVar.f9803h;
            char[] cArr = keyData.meta;
            if ((c6 == cArr[0] && (metaState & 2) == 0) || ((c6 == cArr[2] && (metaState & 2) != 0) || (zM && c6 == '\b' && i10 == 67))) {
                return iVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return (MenuItem) this.f9781f.get(i10);
    }

    public final void h(List list, int i10, KeyEvent keyEvent) {
        boolean zM = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            ArrayList arrayList = this.f9781f;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                i iVar = (i) arrayList.get(i11);
                if (iVar.hasSubMenu()) {
                    iVar.f9809o.h(list, i10, keyEvent);
                }
                char c6 = zM ? iVar.j : iVar.f9803h;
                if ((modifiers & 69647) == ((zM ? iVar.f9805k : iVar.f9804i) & 69647) && c6 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c6 == cArr[0] || c6 == cArr[2] || (zM && c6 == '\b' && i10 == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f9781f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((i) arrayList.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListK = k();
        if (this.f9785k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f9793s;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean zC = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                n nVar = (n) weakReference.get();
                if (nVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zC |= nVar.c();
                }
            }
            ArrayList arrayList = this.f9784i;
            ArrayList arrayList2 = this.j;
            if (zC) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListK.size();
                for (int i10 = 0; i10 < size; i10++) {
                    i iVar = (i) arrayListK.get(i10);
                    if ((iVar.f9818x & 32) == 32) {
                        arrayList.add(iVar);
                    } else {
                        arrayList2.add(iVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(k());
            }
            this.f9785k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return g(i10, keyEvent) != null;
    }

    public final ArrayList k() {
        boolean z2 = this.f9783h;
        ArrayList arrayList = this.f9782g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f9781f;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = (i) arrayList2.get(i10);
            if (iVar.isVisible()) {
                arrayList.add(iVar);
            }
        }
        this.f9783h = false;
        this.f9785k = true;
        return arrayList;
    }

    public boolean l() {
        return this.f9795u;
    }

    public boolean m() {
        return this.f9778c;
    }

    public boolean n() {
        return this.f9779d;
    }

    public final void o(boolean z2) {
        if (this.f9788n) {
            this.f9789o = true;
            if (z2) {
                this.f9790p = true;
                return;
            }
            return;
        }
        if (z2) {
            this.f9783h = true;
            this.f9785k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f9793s;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            n nVar = (n) weakReference.get();
            if (nVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                nVar.f();
            }
        }
        r();
    }

    public final boolean p(MenuItem menuItem, j jVar, int i10) {
        boolean zExpandActionView;
        i iVar = (i) menuItem;
        if (iVar == null || !iVar.isEnabled()) {
            return false;
        }
        h hVar = iVar.f9808n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = iVar.f9810p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(iVar)) && !hVar.e(hVar, iVar)) {
            Intent intent = iVar.f9802g;
            if (intent != null) {
                try {
                    hVar.f9776a.startActivity(intent);
                    zExpandActionView = true;
                } catch (ActivityNotFoundException e10) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
                }
            }
            zExpandActionView = false;
        } else {
            zExpandActionView = true;
        }
        if ((iVar.f9819y & 8) != 0 && iVar.f9820z != null) {
            zExpandActionView |= iVar.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (iVar.hasSubMenu()) {
            if ((i10 & 4) == 0) {
                c(false);
            }
            if (!iVar.hasSubMenu()) {
                r rVar = new r(this.f9776a, this, iVar);
                iVar.f9809o = rVar;
                rVar.setHeaderTitle(iVar.f9800e);
            }
            r rVar2 = iVar.f9809o;
            CopyOnWriteArrayList copyOnWriteArrayList = this.f9793s;
            if (!copyOnWriteArrayList.isEmpty()) {
                zJ = jVar != null ? jVar.j(rVar2) : false;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    n nVar = (n) weakReference.get();
                    if (nVar == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zJ) {
                        zJ = nVar.j(rVar2);
                    }
                }
            }
            zExpandActionView |= zJ;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i10 & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return p(findItem(i10), null, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        i iVarG = g(i10, keyEvent);
        boolean zP = iVarG != null ? p(iVarG, null, i11) : false;
        if ((i11 & 2) != 0) {
            c(true);
        }
        return zP;
    }

    public final void q(int i10, CharSequence charSequence, int i11, View view) {
        if (view != null) {
            this.f9787m = view;
            this.f9786l = null;
        } else {
            if (i10 > 0) {
                this.f9786l = this.f9777b.getText(i10);
            } else if (charSequence != null) {
                this.f9786l = charSequence;
            }
            if (i11 > 0) {
                i4.c.getDrawable(this.f9776a, i11);
            }
        }
        o(false);
    }

    public final void r() {
        this.f9788n = false;
        if (this.f9789o) {
            this.f9789o = false;
            o(this.f9790p);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        ArrayList arrayList = this.f9781f;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i12 = -1;
                break;
            } else if (((i) arrayList.get(i12)).f9797b == i10) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            int size2 = arrayList.size() - i12;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= size2 || ((i) arrayList.get(i12)).f9797b != i10) {
                    break;
                }
                if (i12 >= 0 && i12 < arrayList.size()) {
                    arrayList.remove(i12);
                }
                i11 = i13;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        ArrayList arrayList = this.f9781f;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (((i) arrayList.get(i11)).f9796a == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i11);
        o(true);
    }

    public final void s() {
        if (this.f9788n) {
            return;
        }
        this.f9788n = true;
        this.f9789o = false;
        this.f9790p = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z2, boolean z10) {
        ArrayList arrayList = this.f9781f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = (i) arrayList.get(i11);
            if (iVar.f9797b == i10) {
                iVar.f9818x = (iVar.f9818x & (-5)) | (z10 ? 4 : 0);
                iVar.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f9795u = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z2) {
        ArrayList arrayList = this.f9781f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = (i) arrayList.get(i11);
            if (iVar.f9797b == i10) {
                iVar.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z2) {
        ArrayList arrayList = this.f9781f;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = (i) arrayList.get(i11);
            if (iVar.f9797b == i10) {
                int i12 = iVar.f9818x;
                int i13 = (i12 & (-9)) | (z2 ? 0 : 8);
                iVar.f9818x = i13;
                if (i12 != i13) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f9778c = z2;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f9781f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return a(0, 0, 0, this.f9777b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f9777b.getString(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        i iVarA = a(i10, i11, i12, charSequence);
        r rVar = new r(this.f9776a, this, iVarA);
        iVarA.f9809o = rVar;
        rVar.setHeaderTitle(iVarA.f9800e);
        return rVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f9777b.getString(i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f9777b.getString(i13));
    }

    public h j() {
        return this;
    }
}
