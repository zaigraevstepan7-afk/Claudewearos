package l4;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class i extends uk.c {
    public static Font l0(FontFamily fontFamily, int i10) {
        FontStyle fontStyle = new FontStyle((i10 & 1) != 0 ? 700 : 400, (i10 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iO0 = o0(fontStyle, font.getStyle());
        for (int i11 = 1; i11 < fontFamily.getSize(); i11++) {
            Font font2 = fontFamily.getFont(i11);
            int iO02 = o0(fontStyle, font2.getStyle());
            if (iO02 < iO0) {
                font = font2;
                iO0 = iO02;
            }
        }
        return font;
    }

    public static int o0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final FontFamily m0(q4.h[] hVarArr, ContentResolver contentResolver) throws IOException {
        Font fontBuild;
        String str;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (q4.h hVar : hVarArr) {
            if (Objects.equals(hVar.f13226a.getScheme(), "systemfont")) {
                fontBuild = n0(hVar);
            } else {
                try {
                    Uri uri = hVar.f13226a;
                    str = hVar.f13230e;
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e10) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    fontBuild = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(hVar.f13228c).setSlant(hVar.f13229d ? 1 : 0).setTtcIndex(hVar.f13227b);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        fontBuild = ttcIndex.build();
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font n0(q4.h hVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // uk.c
    public final Typeface s(Context context, k4.f fVar, Resources resources, int i10) throws IOException {
        try {
            FontFamily.Builder builder = null;
            for (k4.g gVar : fVar.f9422a) {
                try {
                    Font fontBuild = new Font.Builder(resources, gVar.f9428f).setWeight(gVar.f9424b).setSlant(gVar.f9425c ? 1 : 0).setTtcIndex(gVar.f9427e).setFontVariationSettings(gVar.f9426d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(l0(fontFamilyBuild, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // uk.c
    public final Typeface t(Context context, q4.h[] hVarArr, int i10) {
        try {
            FontFamily fontFamilyM0 = m0(hVarArr, context.getContentResolver());
            if (fontFamilyM0 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyM0).setStyle(l0(fontFamilyM0, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // uk.c
    public final Typeface u(Context context, List list, int i10) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyM0 = m0((q4.h[]) list.get(0), contentResolver);
            if (fontFamilyM0 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyM0);
            for (int i11 = 1; i11 < list.size(); i11++) {
                FontFamily fontFamilyM02 = m0((q4.h[]) list.get(i11), contentResolver);
                if (fontFamilyM02 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyM02);
                }
            }
            return customFallbackBuilder.setStyle(l0(fontFamilyM0, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // uk.c
    public final Typeface v(Context context, Resources resources, int i10, String str, int i11) throws IOException {
        try {
            Font fontBuild = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // uk.c
    public final q4.h z(q4.h[] hVarArr, int i10) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
